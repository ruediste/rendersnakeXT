package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

public class HtmlCanvasTest {

    private static class Canvas extends HtmlCanvasBase<Canvas> implements
            Html5Canvas<Canvas> {

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
        canvas = new Canvas();
        canvas.initialize(writer);
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
        canvas.tag("html").addAttribute("id", "foo").close();
        assertEquals("<html id=\"foo\"></html>", writer.toString());
    }

    @Test
    public void repeatedClasses() throws IOException {
        canvas.tag("html").CLASS("foo").addAttribute("id", "bar").CLASS("foo2")
                .close();
        assertEquals("<html id=\"bar\" class=\"foo foo2\"></html>",
                writer.toString());
    }
}
