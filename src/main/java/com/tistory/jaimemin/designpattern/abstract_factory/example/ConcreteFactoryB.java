package com.tistory.jaimemin.designpattern.abstract_factory.example;

class ConcreteFactoryB implements AbstractFactory {

	@Override
	public AbstractProduct getProduct() {
		return new ProductB();
	}
}
