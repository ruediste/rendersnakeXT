package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class HtmlAttributesBase<TAttr> implements
        HtmlAttributes<TAttr> {

    private StringBuilder classBuilder = new StringBuilder();
    private StringWriter out = new StringWriter();

    @Override
    public void writeCharsOn(Writer writer) throws IOException {
        if (classBuilder.length() > 0) {
            writer.write(" class=\"");
            writer.write(classBuilder.toString());
            writer.write("\"");
        }
        writer.write(out.toString());
    }

    @Override
    public void writeUnescaped(String str) {
        out.write(str);
    }

    @Override
    public TAttr class_(String class_) {
        if (classBuilder.length() > 0)
            classBuilder.append(" ");
        classBuilder.append(class_);
        return self();
    }
}
