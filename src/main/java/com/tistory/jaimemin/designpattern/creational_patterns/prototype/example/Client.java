package com.tistory.jaimemin.designpattern.creational_patterns.prototype.example;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		long start = System.nanoTime();
		ConcretePrototype prototype = new ConcretePrototype("original");
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println(String.format("prototype: %s, 생성 시간: %s나노초", prototype, duration));

		start = System.nanoTime();
		ConcretePrototype cloned = (ConcretePrototype) prototype.clone();
		cloned.setField("cloned");
		end = System.nanoTime();
		duration = end - start;
		System.out.println(String.format("cloned: %s, 생성 시간: %s나노초", cloned, duration));
	}
}
