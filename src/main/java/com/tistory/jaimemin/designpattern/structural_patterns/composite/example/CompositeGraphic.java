package com.tistory.jaimemin.designpattern.structural_patterns.composite.example;

import java.util.ArrayList;
import java.util.List;

// Composite 클래스
class CompositeGraphic implements Graphic {

	private List<Graphic> childGraphics = new ArrayList<>();

	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}

	@Override
	public void draw() {
		for (Graphic graphic : childGraphics) {
			graphic.draw();
		}
	}
}