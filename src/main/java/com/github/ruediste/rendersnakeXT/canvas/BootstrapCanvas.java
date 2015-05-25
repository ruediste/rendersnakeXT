package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Function;

public interface BootstrapCanvas<TSelf extends BootstrapCanvas<TSelf, TAttr>, TAttr extends Html5Attributes<TAttr>>
        extends Html5Canvas<TSelf, TAttr> {

    default TSelf b_container() {
        return b_container(a -> a);
    }

    default TSelf b_container(Function<TAttr, TAttr> attr) {
        return div(attr.compose(a -> a.class_("container")));
    }

    default TSelf b_container_fluid() {
        return b_container_fluid(a -> a);
    }

    default TSelf b_container_fluid(Function<TAttr, TAttr> attr) {
        return div(attr.compose(a -> a.class_("container-fluid")));
    }
}
