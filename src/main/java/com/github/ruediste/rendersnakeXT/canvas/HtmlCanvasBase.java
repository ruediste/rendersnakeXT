package com.github.ruediste.rendersnakeXT.canvas;

import java.io.Writer;

/**
 * Base class for HTML canvases
 */
public abstract class HtmlCanvasBase<TSelf extends HtmlCanvasBase<TSelf>>
        implements HtmlCanvas<TSelf> {

    private HtmlCanvasTarget target;

    protected void initialize(Writer writer) {
        initialize(new HtmlCanvasTarget(writer));
    }

    protected void initialize(HtmlCanvasTarget target) {
        this.target = target;
    }

    @Override
    public HtmlCanvasTarget internal_target() {
        return target;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TSelf self() {
        return (TSelf) this;
    }
}
