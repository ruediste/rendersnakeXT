package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class Html5CanvasTest {

    private static class Attr extends HtmlAttributesBase<Attr> implements
            Html5Attributes<Attr> {

        @Override
        public Attr self() {
            return this;
        }

    }

    private static class Canvas extends DirectHtmlCanvasBase<Canvas> implements
            Html5Canvas<Canvas, Attr> {

        public Canvas(Writer output) {
            super(output);
        }

        @Override
        public Canvas self() {
            return this;
        }

        @Override
        public Attr internal_attr() {
            return new Attr();
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
        assertEquals("<html></html>", writer.toString());
    }

    @Test
    public void simpleWithId() {
        canvas.html(a -> a.id("foo"))._html();
        assertEquals("<html id=\"foo\"></html>", writer.toString());
    }

    @Test
    public void simpleWithIdAndClass() {
        canvas.html(a -> a.id("foo").class_("Hello\">World"))._html();
        assertEquals("<html id=\"foo\" class=\"Hello&#34;>World\"></html>",
                writer.toString());
    }
}
