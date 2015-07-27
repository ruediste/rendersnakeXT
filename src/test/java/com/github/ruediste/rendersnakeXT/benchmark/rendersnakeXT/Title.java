package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import com.github.ruediste.rendersnakeXT.canvas.Renderable;

public class Title implements Renderable<BenchmarkCanvas> {

    public static final Title INSTANCE = new Title();

    @Override
    public void renderOn(BenchmarkCanvas html) {
        html.div().ID("help").CLASS("class").ABBR("abbr")
                .addAttribute("background", "background").write("Benchmark")
                ._div();
    }
}
