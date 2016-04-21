package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.owasp.encoder.Encode;

import com.google.common.base.Strings;

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
     */
    public HtmlCanvasTarget(Writer output) {
        this.out = output;
    }

    public void writeUnescapedWithoutAttributeCommitting(String str) {
        try {
            out.write(str);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
    }

    public void writeUnescaped(String str) {
        commitAttributes();
        writeUnescapedWithoutAttributeCommitting(str);
    }

    public void startTagWithoutEndTag(String postAttributesFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment + " ";
    }

    public void startTag(String display, String postAttributesFragment, String closeFragment) {
        commitAttributes();
        this.postAttributesFragment = postAttributesFragment;
        openTagStack.add(new StackEntry(display, closeFragment));
    }

    public void addAttribute(String key, String value) {
        checkAttributesUncommited();
        writeUnescapedWithoutAttributeCommitting(" ");
        writeUnescapedWithoutAttributeCommitting(key);
        writeUnescapedWithoutAttributeCommitting("=\"");
        writeUnescapedWithoutAttributeCommitting(Encode.forHtmlAttribute(value));
        writeUnescapedWithoutAttributeCommitting("\"");
    }

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

    public void CLASS(String class_) {
        checkAttributesUncommited();
        if (Strings.isNullOrEmpty(class_))
            return;
        if (classBuilder.length() > 0)
            classBuilder.append(" ");
        classBuilder.append(class_);
    }

    public void checkAttributesUncommited() {
        if (postAttributesFragment == null)
            throw new RuntimeException("attributes of the last tag are already commited");
    }

    public void close() {
        if (openTagStack.isEmpty())
            throw new RuntimeException("Empty Stack");
        writeUnescaped(openTagStack.remove(openTagStack.size() - 1).closeFragment);
        writeUnescaped(" ");
    }

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

    public void flush() {
        try {
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
