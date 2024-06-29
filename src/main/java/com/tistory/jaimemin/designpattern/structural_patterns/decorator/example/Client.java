package com.tistory.jaimemin.designpattern.structural_patterns.decorator.example;

public class Client {

	private static final boolean circle = false;

	private static final boolean isColorRed = true;

	public static void main(String[] args) {
		Shape shape = null;

		if (circle) {
			shape = isColorRed ? new RedShapeDecorator(new Circle()) : new Circle();
		} else {
			shape = isColorRed ? new RedShapeDecorator(new Rectangle()) : new Rectangle();
		}

		if (shape != null) {
			shape.draw();
		}
	}
}
