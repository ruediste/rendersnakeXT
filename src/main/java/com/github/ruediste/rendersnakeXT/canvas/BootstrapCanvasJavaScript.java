package com.github.ruediste.rendersnakeXT.canvas;

public interface BootstrapCanvasJavaScript<TSelf extends BootstrapCanvas<TSelf>> extends Html5Canvas<TSelf> {

    /**
     * Starts a modal, including the modal-dialog and modal-content div
     * 
     * <pre>
     * {@code
    <div class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Modal title</h4>
      </div>
      <div class="modal-body">
        <p>One fine body&hellip;</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
     * }
     * </pre>
     */

    default TSelf bModal() {
        return bModal(false);
    }

    default TSelf bModal(boolean show) {
        TSelf result = tag("div", "bModal").CLASS("modal").TABINDEX("-1").ROLE("dialog");
        if (show)
            result = result.STYLE("display: block");
        return result.div().CLASS("modal-dialog").ROLE("document").div().CLASS("modal-content");
    }

    default TSelf _bModal() {
        return _div()._div().close("bModal");
    }

    default TSelf bModalHeader() {
        return tag("div", "bModalHeader");
    }

    default TSelf _bModalHeader() {
        return close("bModalHeader");
    }

    default TSelf bModalBody() {
        return tag("div", "bModalBody");
    }

    default TSelf _bModalBody() {
        return close("bModalBody");
    }

    default TSelf bModalFooter() {
        return tag("div", "bModalFooter");
    }

    default TSelf _bModalFooter() {
        return close("bModalFooter");
    }
}
