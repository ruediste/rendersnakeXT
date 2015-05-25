package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class Html5CanvasTest {

    private static class Canvas extends DirectHtmlCanvasBase<Canvas> implements
            Html5Canvas<Canvas> {

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
        canvas.html()._html();
        expect("<html></html>");
    }

    @Test
    public void simpleWithId() {
        canvas.html().ID("foo")._html();
        expect("<html id=\"foo\"></html>");
    }

    @Test
    public void simpleWithIdAndClass() {
        canvas.html().ID("foo").CLASS("Hello\">World")._html();
        expect("<html id=\"foo\" class=\"Hello&#34;>World\"></html>");
    }

    private void expect(String str) {
        assertEquals(str, writer.toString());
    }
}
