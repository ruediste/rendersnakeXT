package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class HtmlAttributesBaseTest {

    private static class Attr extends HtmlAttributesBase<Attr> {

        @Override
        public Attr self() {
            return this;
        }

    }

    @Test
    public void repeatedClasses() throws IOException {
        StringWriter writer = new StringWriter();
        new Attr().class_("foo").add("id", "bar").class_("foo2")
                .writeCharsOn(writer);
        assertEquals(" class=\"foo foo2\" id=\"bar\"", writer.toString());
    }
}
