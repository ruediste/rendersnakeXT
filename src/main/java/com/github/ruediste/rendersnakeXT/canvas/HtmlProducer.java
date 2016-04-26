package com.github.ruediste.rendersnakeXT.canvas;

@FunctionalInterface
public interface HtmlProducer {
    void produce(HtmlConsumer consumer);
}
