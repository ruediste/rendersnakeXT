package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class HtmlCanvasTest {

    private static class Canvas extends DirectHtmlCanvasBase<Canvas> {

        public Canvas(Writer output) {
            super(output);
        }

        @Override
        public Canvas self() {
            return this;
        }

    }

    Canvas canvas;
    StringWriter writer;

    @Before
    public void before() {
        writer = new StringWriter();
        canvas = new Canvas(writer);
    }

    @Test
    public void simple() {
        canvas.tag("html").close();
        assertEquals("<html></html>", writer.toString());
    }

    @Test
    public void escaped() {
        canvas.write("foo<?>");
        assertEquals("foo&lt;?&gt;", writer.toString());
    }

    @Test
    public void withAttrs() {
        canvas.tag("html", w -> w.write(" id=\"foo\"")).close();
        assertEquals("<html id=\"foo\"></html>", writer.toString());
    }

}
