package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.example;

class ConcreteFactoryB implements AbstractFactory {

	@Override
	public AbstractProduct getProduct() {
		return new ProductB();
	}
}
