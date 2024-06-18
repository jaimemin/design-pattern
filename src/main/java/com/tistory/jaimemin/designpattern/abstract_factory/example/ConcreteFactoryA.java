package com.tistory.jaimemin.designpattern.abstract_factory.example;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public AbstractProduct getProduct() {
		return new ProductA();
	}
}
