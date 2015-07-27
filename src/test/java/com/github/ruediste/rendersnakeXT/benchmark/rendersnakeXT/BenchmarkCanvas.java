package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import java.io.Writer;

import com.github.ruediste.rendersnakeXT.canvas.Html5Canvas;
import com.github.ruediste.rendersnakeXT.canvas.HtmlCanvasBase;

class BenchmarkCanvas extends HtmlCanvasBase<BenchmarkCanvas> implements
        Html5Canvas<BenchmarkCanvas> {

    public BenchmarkCanvas(Writer writer) {
        initialize(writer);
    }
}