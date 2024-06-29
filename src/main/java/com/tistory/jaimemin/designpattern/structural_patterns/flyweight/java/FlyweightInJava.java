package com.tistory.jaimemin.designpattern.structural_patterns.flyweight.java;

public class FlyweightInJava {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(10);
		System.out.println(i1 == i2);

		i1 = Integer.valueOf(1000);
		i2 = Integer.valueOf(1000);
		System.out.println(i1 == i2);
	}
}
