package com.tistory.jaimemin.designpattern.structural_patterns.composite.example;

public class Client {

	public static void main(String[] args) {
		// 개별 객체 생성
		Circle circle = new Circle();
		Square square = new Square();
		Circle circle2 = new Circle();

		// Composite 객체 생성
		CompositeGraphic compositeGraphic = new CompositeGraphic();
		CompositeGraphic anotherCompositeGraphic = new CompositeGraphic();

		// 트리 구조 구성
		compositeGraphic.add(circle);
		compositeGraphic.add(square);
		anotherCompositeGraphic.add(circle2);
		compositeGraphic.add(anotherCompositeGraphic);

		// 전체 트리 구조 그리기
		compositeGraphic.draw();
	}
}
