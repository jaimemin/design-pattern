package com.tistory.jaimemin.designpattern.structural_patterns.decorator.example;

public class Circle implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
