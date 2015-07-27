package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import com.github.ruediste.rendersnakeXT.canvas.Renderable;

public class HomePage implements Renderable<BenchmarkCanvas> {

    public static final HomePage INSTANCE = new HomePage();

    @Override
    public void renderOn(BenchmarkCanvas html) {
        html.html().body().render(Contents.INSTANCE)._body()._html();
    }
}
