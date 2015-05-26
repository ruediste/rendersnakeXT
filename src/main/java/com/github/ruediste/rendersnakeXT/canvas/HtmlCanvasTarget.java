package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.owasp.encoder.Encode;

/**
 * Target for a {@link HtmlCanvasBase}. This class can be instantiated and then
 * wrapped by any {@link HtmlCanvas}.
 */
public class HtmlCanvasTarget {

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

    /**
     * The writer that will collect all HTML code.
     */
    protected Writer out;

    /**
     * Create a new HtmlCanvas that writes its output on Writer.
     * 
     * @param output
     */
    public HtmlCanvasTarget(Writer output) {
        this.out = output;
    }

    public void internal_writeUnescaped(String str) {
        try {
            out.write(str);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
    }

    /**
     * Internal method directly writing to the output buffer, without any bells
     * and whistles.
     */
    public void internal_writeUnescaped(CharactersWriteable writeable) {
        try {
            writeable.writeCharsOn(out);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
    }

    public void writeUnescaped(CharactersWriteable writeable) {
        commitAttributes();
        internal_writeUnescaped(writeable);
    }

    public void writeUnescaped(String str) {
        commitAttributes();
        internal_writeUnescaped(str);
    }

    public void startTagWithoutEndTag(String postAttributesFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment;
    }

    public void startTag(String display, String postAttributesFragment,
            String closeFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment;
        openTagStack.add(new StackEntry(display, closeFragment));
    }

    public void addAttribute(String key, String value) {
        checkAttributesUncommited();
        internal_writeUnescaped(" " + key + "=\"");
        internal_writeUnescaped(Encode.forHtmlAttribute(value));
        internal_writeUnescaped("\"");
    }

    public void commitAttributes() {
        if (postAttributesFragment != null) {
            if (classBuilder.length() > 0) {
                addAttribute("class", classBuilder.toString());
                classBuilder.setLength(0);
            }
            internal_writeUnescaped(out -> out.write(postAttributesFragment));
            postAttributesFragment = null;
        }
    }

    public void CLASS(String class_) {
        checkAttributesUncommited();
        if (classBuilder.length() > 0)
            classBuilder.append(" ");
        classBuilder.append(class_);
    }

    public void checkAttributesUncommited() {
        if (postAttributesFragment == null)
            throw new RuntimeException(
                    "attributes of the last tag are already commited");
    }

    public void close() {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Empty Stack");
        writeUnescaped(openTagStack.remove(openTagStack.size() - 1).closeFragment);
    }

    public void close(String expectedDisplay) {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Open Tag stack is empty");
        StackEntry popped = openTagStack.remove(openTagStack.size() - 1);
        if (!popped.display.equals(expectedDisplay))
            throw new RuntimeException("Expected to close \"" + expectedDisplay
                    + "\" but \"" + popped.display + "\" was started");
        writeUnescaped(popped.closeFragment);
    }

}
