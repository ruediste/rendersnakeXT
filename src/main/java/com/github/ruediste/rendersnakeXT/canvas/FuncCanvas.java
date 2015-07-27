package com.github.ruediste.rendersnakeXT.canvas;

import java.util.Optional;
import java.util.function.Consumer;

public interface FuncCanvas<TSelf extends FuncCanvas<TSelf>> extends
        HtmlCanvas<TSelf> {

    /**
     * Supply the value of the optional to the consumer if the value is present
     */
    default <T> TSelf fIfPresent(Optional<T> optional,
            Consumer<? super T> renderer) {
        optional.ifPresent(renderer);
        return self();
    }

    /**
     * run a renderer if a condition is true
     */
    default TSelf fIf(boolean condition, Runnable renderer) {
        if (condition)
            renderer.run();
        return self();
    }

    /**
     * run a renderer if a condition is true, and another one if the condition
     * is false
     */
    default TSelf fIf(boolean condition, Runnable ifTrue, Runnable ifFalse) {
        if (condition)
            ifTrue.run();
        else
            ifFalse.run();
        return self();
    }

    /**
     * Supply a value to a renderer. This allows the inline definition of a
     * local variable.
     * 
     * <pre>
     * {@code
     * html.fWith(util.complexCalculation(), value -> html
     *   .write(value.getX())
     *   .write(value.getY())
     * );
     * }
     * </pre>
     */
    default <T> TSelf fWith(T value, Consumer<T> renderer) {
        renderer.accept(value);
        return self();
    }

    /**
     * supply each value of an iterable to a renderer
     */
    default <T> TSelf fForEach(Iterable<T> items, Consumer<? super T> renderer) {
        for (T item : items) {
            renderer.accept(item);
        }
        return self();
    }
}
