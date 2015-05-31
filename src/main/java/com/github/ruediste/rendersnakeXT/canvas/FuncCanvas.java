package com.github.ruediste.rendersnakeXT.canvas;

import java.util.Optional;
import java.util.function.Consumer;

public interface FuncCanvas<TSelf extends FuncCanvas<TSelf>> extends
        HtmlCanvas<TSelf> {

    default <T> TSelf fIfPresent(Optional<T> optional,
            Consumer<? super T> renderer) {
        optional.ifPresent(renderer);
        return self();
    }

    default <T> TSelf fForEach(Iterable<T> items, Consumer<? super T> renderer) {
        for (T item : items) {
            renderer.accept(item);
        }
        return self();
    }
}
