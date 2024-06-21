package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.example;

public class Client {

	private AbstractProduct product;

	public Client(AbstractFactory factory) {
		this.product = factory.getProduct();
	}

	public static void main(String[] args) {
		createClientAndRunProductFunc(new ConcreteFactoryA());
		createClientAndRunProductFunc(new ConcreteFactoryB());
	}

	private static void createClientAndRunProductFunc(AbstractFactory factory) {
		Client client = new Client(factory);
		client.product.productFunc();
	}
}
