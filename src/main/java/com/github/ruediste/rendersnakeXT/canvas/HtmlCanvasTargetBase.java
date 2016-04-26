package com.github.ruediste.rendersnakeXT.canvas;

import java.util.ArrayList;
import java.util.function.Supplier;

import org.owasp.encoder.Encode;

import com.google.common.base.Strings;

/**
 * Target for a {@link HtmlCanvasBase}. This class can be instantiated and then
 * wrapped by any {@link HtmlCanvas}.
 */
public abstract class HtmlCanvasTargetBase implements HtmlCanvasTarget {

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

        public StackEntry(String display, String closeFragment) {
            this.display = display;
            this.closeFragment = closeFragment;
        }

    }

    /**
     * Stack of written open elements to be closed.
     */
    protected ArrayList<StackEntry> openTagStack = new ArrayList<>(32);

    /**
     * Builds the contents of the current "class" attribute.
     */
    private StringBuilder classBuilder = new StringBuilder();

    /**
     * The html fragment to be emitted when commiting the attributes of the
     * current tag
     */
    protected String postAttributesFragment;

    @Override
    public void writeUnescaped(String str) {
        commitAttributes();
        writeUnescapedWithoutAttributeCommitting(str);
    }

    @Override
    public void startTagWithoutEndTag(String postAttributesFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment + " ";
    }

    @Override
    public void startTag(String display, String postAttributesFragment, String closeFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment;
        openTagStack.add(new StackEntry(display, closeFragment));
    }

    @Override
    public void addAttribute(String key, String value) {
        checkAttributesUncommited();
        writeUnescapedWithoutAttributeCommitting(" ");
        writeUnescapedWithoutAttributeCommitting(key);
        writeUnescapedWithoutAttributeCommitting("=\"");
        writeUnescapedWithoutAttributeCommitting(Encode.forHtmlAttribute(value));
        writeUnescapedWithoutAttributeCommitting("\"");
    }

    @Override
    public void addAttribute(String key, Supplier<String> value) {

        checkAttributesUncommited();
        writeUnescapedWithoutAttributeCommitting(" ");
        writeUnescapedWithoutAttributeCommitting(key);
        writeUnescapedWithoutAttributeCommitting("=\"");
        writeUnescapedWithoutAttributeCommitting(() -> Encode.forHtmlAttribute(value.get()));
        writeUnescapedWithoutAttributeCommitting("\"");
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
        if (!popped.display.equals(expectedDisplay))
            throw new RuntimeException(
                    "Expected to close \"" + expectedDisplay + "\" but \"" + popped.display + "\" was started");
        writeUnescaped(popped.closeFragment);
        writeUnescaped(" ");
    }

}
