package com.tistory.jaimemin.designpattern.structural_patterns.composite.example;

// Leaf 클래스
class Circle implements Graphic {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}
