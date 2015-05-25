package com.github.ruediste.rendersnakeXT.canvas;

import java.util.ArrayList;

/**
 * Base class for HTML canvases
 */
public abstract class TagStackHtmlCanvasBase<TSelf> implements
        HtmlCanvas<TSelf> {

    /**
     * Collection of written open elements to be closed.
     */
    protected ArrayList<String> openTagStack = new ArrayList<String>(32);

    @Override
    public TSelf pushTag(String expectedClose) {
        openTagStack.add(expectedClose);
        return self();
    }

    @Override
    public TSelf close() {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Empty Stack");
        writeUnescaped(openTagStack.remove(openTagStack.size() - 1));
        return self();
    }

    @Override
    public TSelf close(String expectedTag) {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Open Tag stack is empty");
        String popped = openTagStack.remove(openTagStack.size() - 1);
        if (!popped.equals(expectedTag))
            throw new RuntimeException("Expected " + expectedTag + " but was "
                    + popped);
        writeUnescaped(popped);
        return self();
    }

}
