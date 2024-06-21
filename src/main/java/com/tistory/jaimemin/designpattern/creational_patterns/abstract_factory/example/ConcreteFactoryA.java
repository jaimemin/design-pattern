package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.example;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public AbstractProduct getProduct() {
		return new ProductA();
	}
}
