package com.github.ruediste.rendersnakeXT.canvas;

import java.util.ArrayList;

/**
 * Base class for HTML canvases
 */
public abstract class HtmlCanvasBase<TSelf extends HtmlCanvasBase<TSelf>>
        implements HtmlCanvas<TSelf> {

    protected static class StackEntry {
        String display;
        String closeFragment;

        public StackEntry(String display, String closeFragment) {
            this.display = display;
            this.closeFragment = closeFragment;
        }

    }

    /**
     * Collection of written open elements to be closed.
     */
    protected ArrayList<StackEntry> openTagStack = new ArrayList<>(32);

    private StringBuilder classBuilder = new StringBuilder();
    protected String postAttributesFragment;

    @Override
    public TSelf startTag(String display, String postAttributesFragment,
            String closeFragment) {
        commitAttributes();
        classBuilder.setLength(0);
        this.postAttributesFragment = postAttributesFragment;
        openTagStack.add(new StackEntry(display, closeFragment));
        return self();
    }

    @Override
    public void commitAttributes() {
        if (postAttributesFragment != null) {
            if (classBuilder.length() > 0) {
                addAttribute("class", classBuilder.toString());
            }
            internal_writeUnescaped(out -> out.write(postAttributesFragment));
            postAttributesFragment = null;
        }
    }

    @Override
    public TSelf CLASS(String class_) {
        checkAttributesUncommited();
        if (classBuilder.length() > 0)
            classBuilder.append(" ");
        classBuilder.append(class_);
        return self();
    }

    @Override
    public void checkAttributesUncommited() {
        if (postAttributesFragment == null)
            throw new RuntimeException(
                    "attributes of the last tag are already commited");
    }

    @Override
    public TSelf close() {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Empty Stack");
        writeUnescaped(openTagStack.remove(openTagStack.size() - 1).closeFragment);
        return self();
    }

    @Override
    public TSelf close(String expectedDisplay) {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Open Tag stack is empty");
        StackEntry popped = openTagStack.remove(openTagStack.size() - 1);
        if (!popped.display.equals(expectedDisplay))
            throw new RuntimeException("Expected to close \"" + expectedDisplay
                    + "\" but \"" + popped.display + "\" was started");
        writeUnescaped(popped.closeFragment);
        return self();
    }

}
