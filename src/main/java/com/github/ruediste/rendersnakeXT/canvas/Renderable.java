package com.github.ruediste.rendersnakeXT.canvas;

public interface Renderable<T> {

	/**
	 * Render the receiver using the provided canvas
	 */
	void renderOn(T html);
}
