package com.github.ruediste.rendersnakeXT.benchmark.rendersnake;

import static org.rendersnake.HtmlAttributesFactory.id;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;

public class Title implements Renderable {

    public static final Title INSTANCE = new Title();

    @Override
    public void renderOn(HtmlCanvas html) throws IOException {
        html.div(
                id("help").class_("class").abbr("abbr")
                        .background("background")).write("Benchmark", false)
                ._div();
    }
}
