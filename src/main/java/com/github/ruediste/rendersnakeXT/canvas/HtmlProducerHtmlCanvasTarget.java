package com.github.ruediste.rendersnakeXT.canvas;

import java.util.ArrayList;
import java.util.List;;

/**
 * Target for a {@link HtmlCanvasBase}. This class can be instantiated and then
 * wrapped by any {@link HtmlCanvas}.
 */
public class HtmlProducerHtmlCanvasTarget extends HtmlCanvasTargetBase {

    private final List<HtmlProducer> producers = new ArrayList<>();

    private StringBuilder constHtml = new StringBuilder();

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {
        constHtml.append(str);
    }

    @Override
    public void flush() {
        if (constHtml.length() > 0) {
            String tmp = constHtml.toString();
            producers.add(consumer -> consumer.accept(tmp));
            constHtml.setLength(0);
        }
    }

    public void addProducer(HtmlProducer producer, boolean commitAttributes) {
        if (commitAttributes)
            commitAttributes();
        flush();
        producers.add(producer);
    }

    public List<HtmlProducer> getProducers() {
        return producers;
    }

}
