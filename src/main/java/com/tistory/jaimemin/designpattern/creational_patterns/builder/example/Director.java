package com.tistory.jaimemin.designpattern.creational_patterns.builder.example;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Product construct() {
		return builder.buildPartA("파트 A")
			.buildPartB("파트 B")
			.getProduct();
	}
}
