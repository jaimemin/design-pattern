package com.tistory.jaimemin.designpattern.builder.example;

public class Client {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.construct();

		System.out.println(product);
	}
}
