package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import com.github.ruediste.rendersnakeXT.canvas.Renderable;

public class Contents implements Renderable<BenchmarkCanvas> {

    public static final Contents INSTANCE = new Contents();

    @Override
    public void renderOn(BenchmarkCanvas html) {
        for (int t = 0; t < 10; t++) {
            html.render(Title.INSTANCE).div().addAttribute("align", "left")
                    .writeUnescaped("no need to escape this")._div();
        }
    }
}
