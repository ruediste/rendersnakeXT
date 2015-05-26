package com.github.ruediste.rendersnakeXT.canvas;

import java.io.Writer;

/**
 * Base class for HTML canvases
 */
public abstract class HtmlCanvasBase<TSelf extends HtmlCanvasBase<TSelf>>
		implements HtmlCanvas<TSelf> {

	private final HtmlCanvasTarget target;

	public HtmlCanvasBase(Writer writer) {
		this.target = new HtmlCanvasTarget(writer);
	}

	public HtmlCanvasBase(HtmlCanvasTarget target) {
		this.target = target;
	}

	@Override
	public void internal_writeUnescaped(CharactersWriteable writeable) {
		target.internal_writeUnescaped(writeable);
	}

	@Override
	public TSelf startTag(String display, String postAttributesFragment,
			String closeFragment) {
		target.startTag(display, postAttributesFragment, closeFragment);
		return self();
	}

	@Override
	public TSelf addAttribute(String key, String value) {
		target.addAttribute(key, value);
		return self();
	}

	@Override
	public void commitAttributes() {
		target.commitAttributes();
	}

	@Override
	public TSelf CLASS(String class_) {
		target.CLASS(class_);
		return self();
	}

	@Override
	public void checkAttributesUncommited() {
		target.checkAttributesUncommited();
	}

	@Override
	public TSelf close() {
		target.close();
		return self();
	}

	@Override
	public TSelf close(String expectedDisplay) {
		target.close(expectedDisplay);
		return self();
	}

	public HtmlCanvasTarget getTarget() {
		return target;
	}

}
