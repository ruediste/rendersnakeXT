package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;
import java.io.Writer;

public abstract class DirectHtmlCanvasBase<TSelf> extends
        TagStackHtmlCanvasBase<TSelf> {
    /**
     * The writer that will collect all HTML code.
     */
    protected Writer out;

    /**
     * Create a new HtmlCanvas that writes its output on Writer.
     * 
     * @param output
     */
    public DirectHtmlCanvasBase(Writer output) {
        this.out = output;
    }

    @Override
    public TSelf writeUnescaped(String str) {
        try {
            out.write(str);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
        return self();
    }

    @Override
    public TSelf writeUnescaped(CharactersWriteable writeable) {
        try {
            writeable.writeCharsOn(out);
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to output", e);
        }
        return self();
    }

}
