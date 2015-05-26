package com.github.ruediste.rendersnakeXT.canvas;

import java.io.Writer;

/**
 * Base class for HTML canvases
 */
public abstract class HtmlCanvasBase<TSelf extends HtmlCanvasBase<TSelf>>
        implements HtmlCanvas<TSelf> {

    private HtmlCanvasTarget target;

    public void initialize(Writer writer) {
        this.target = new HtmlCanvasTarget(writer);
    }

    public void initialize(HtmlCanvasTarget target) {
        this.target = target;
    }

    public HtmlCanvasTarget getTarget() {
        return internal_target();
    }

    @Override
    public HtmlCanvasTarget internal_target() {
        return target;
    }

}
