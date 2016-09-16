package com.github.ruediste.rendersnakeXT.canvas;

import static java.util.stream.Collectors.joining;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.common.base.Strings;

/**
 * Target for a {@link HtmlCanvasBase}. This class can be instantiated and then
 * wrapped by any {@link HtmlCanvas}.
 */
public abstract class HtmlCanvasTargetBase implements HtmlCanvasTarget {

    public boolean captureStartStackTraces;

    /**
     * Entry in the current html tag stack
     */
    protected static class StackEntry {
        /**
         * The logical name of the tag
         */
        String display;

        /**
         * The html fragment to be emitted when closing the tag
         */
        String closeFragment;

        private StackTraceElement[] startTrace;

        public StackEntry(String display, String closeFragment, StackTraceElement[] startTrace) {
            this.display = display;
            this.closeFragment = closeFragment;
            this.startTrace = startTrace;
        }

    }

    /**
     * Stack of written open elements to be closed.
     */
    protected ArrayList<StackEntry> openTagStack = new ArrayList<>(32);

    /**
     * Builds the contents of the current "class" attribute.
     */
    protected StringBuilder classBuilder = new StringBuilder();

    /**
     * The html fragment to be emitted when commiting the attributes of the
     * current tag, null if there is no current tag
     */
    protected String postAttributesFragment;

    @Override
    public void writeUnescaped(String str) {
        commitAttributes();
        writeUnescapedWithoutAttributeCommitting(str);
    }

    @Override
    public void tagStartedWithoutEndTag(String postAttributesFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment + " ";
    }

    @Override
    public void tagStarted(String display, String postAttributesFragment, String closeFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment;

        openTagStack.add(new StackEntry(display, closeFragment,
                captureStartStackTraces ? Thread.currentThread().getStackTrace() : null));
    }

    @Override
    public void commitAttributes() {
        if (postAttributesFragment != null) {
            if (classBuilder.length() > 0) {
                addAttribute("class", classBuilder.toString());
                classBuilder.setLength(0);
            }
            writeUnescapedWithoutAttributeCommitting(postAttributesFragment);
            postAttributesFragment = null;
        }
    }

    @Override
    public void CLASS(String class_) {
        checkAttributesUncommited();
        if (Strings.isNullOrEmpty(class_))
            return;
        if (classBuilder.length() > 0)
            classBuilder.append(" ");
        classBuilder.append(class_);
    }

    @Override
    public void checkAttributesUncommited() {
        if (postAttributesFragment == null)
            throw new RuntimeException("attributes of the last tag are already commited");
    }

    @Override
    public void close() {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Empty Stack");
        writeUnescaped(openTagStack.remove(openTagStack.size() - 1).closeFragment);
        writeUnescaped(" ");
    }

    @Override
    public void close(String expectedDisplay) {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Open Tag stack is empty");
        StackEntry popped = openTagStack.remove(openTagStack.size() - 1);
        if (!popped.display.equals(expectedDisplay)) {
            StackTraceElement[] trace = popped.startTrace;
            if (trace != null) {
                RuntimeException cause = new RuntimeException("Attempt to close " + expectedDisplay);
                cause.setStackTrace(filterTrace(cause.getStackTrace()));

                RuntimeException ex = new RuntimeException("Expected to close \"" + expectedDisplay + "\" but \""
                        + popped.display + "\" was started here:", cause);
                int idx = firstOtherPackageElement(trace);
                ex.setStackTrace(trace);
                // ex.setStackTrace(Arrays.copyOfRange(trace, idx, idx));
                throw ex;
            } else
                throw new RuntimeException(
                        "Expected to close \"" + expectedDisplay + "\" but \"" + popped.display + "\" was started");
        }
        ;
        writeUnescaped(popped.closeFragment);
        writeUnescaped(" ");
    }

    private StackTraceElement[] filterTrace(StackTraceElement[] causeTrace) {
        StackTraceElement[] copyOfRange = Arrays.copyOfRange(causeTrace, firstOtherPackageElement(causeTrace),
                causeTrace.length);
        return copyOfRange;
    }

    private int firstOtherPackageElement(StackTraceElement[] causeTrace) {
        String basePackage = getClass().getName().substring(0, getClass().getName().lastIndexOf("."));
        int i;
        for (i = 0; i < causeTrace.length; i++) {
            String className = causeTrace[i].getClassName();
            if (className != null && !className.startsWith(basePackage))
                break;
        }
        return i;
    }

    public void checkAllTagsClosed() {
        if (!openTagStack.isEmpty())
            throw new RuntimeException("The following tags are still open: "
                    + openTagStack.stream().map(e -> e.display).collect(joining(", ")));
    }
}
