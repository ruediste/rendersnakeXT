package com.github.ruediste.rendersnakeXT.canvas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.google.common.base.Charsets;

/**
 * {@link HtmlConsumer} building a byte array
 */
public class ByteArrayHtmlConsumer implements HtmlConsumer {

    ByteArrayOutputStream out;

    public ByteArrayHtmlConsumer() {
        this(new ByteArrayOutputStream());
    }

    public ByteArrayHtmlConsumer(ByteArrayOutputStream out) {
        this.out = out;
    }

    @Override
    public void accept(String html) {
        try {
            out.write(html.getBytes(Charsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Return a copy of the current contents of this consumer
     */
    public byte[] getByteArray() {
        return out.toByteArray();
    }
}
