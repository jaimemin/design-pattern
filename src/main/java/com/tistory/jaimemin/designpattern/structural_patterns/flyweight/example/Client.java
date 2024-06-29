package com.tistory.jaimemin.designpattern.structural_patterns.flyweight.example;

public class Client {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight1 = factory.getFlyweight("변하지 않는 속성 1");
		Flyweight flyweight2 = factory.getFlyweight("변하지 않는 속성 2");
		Flyweight flyweight3 = factory.getFlyweight("변하지 않는 속성 1");

		// 자주 변하는 속성
		flyweight1.operation("X");
		flyweight2.operation("Y");
		flyweight3.operation("Z");

		System.out.println("flyweight1 == flyweight3: " + (flyweight1 == flyweight3));
	}
}
