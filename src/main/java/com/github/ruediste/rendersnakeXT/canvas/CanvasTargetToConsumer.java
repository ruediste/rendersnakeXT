package com.github.ruediste.rendersnakeXT.canvas;

public class CanvasTargetToConsumer extends HtmlCanvasTargetBase {

    private HtmlConsumer consumer;

    public CanvasTargetToConsumer(HtmlConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {
        consumer.accept(str);
    }

    @Override
    public void flush() {
        // NOP
    }

}
