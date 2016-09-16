package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;
import java.io.Writer;

/**
 * Target for a {@link HtmlCanvasBase}. This class can be instantiated and then
 * wrapped by any {@link HtmlCanvas}.
 */
public class DirectHtmlCanvasTarget extends HtmlCanvasTargetBase {

    /**
     * The writer that will collect all HTML code.
     */
    protected Writer out;

    /**
     * Create a new HtmlCanvas that writes its output on Writer.
     */
    public DirectHtmlCanvasTarget(Writer output) {
        this.out = output;
    }

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {
        try {
            out.write(str);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
    }

    @Override
    public void flush() {
        try {
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
