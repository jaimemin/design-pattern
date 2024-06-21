package com.tistory.jaimemin.designpattern.builder.example;

public class ConcreteBuilder implements Builder{

	private Product product;

	public ConcreteBuilder() {
		product = new Product();
	}

	@Override
	public Builder buildPartA(String s) {
		product.setPartA(s);

		return this;
	}

	@Override
	public Builder buildPartB(String s) {
		product.setPartB(s);

		return this;
	}

	@Override
	public Product getProduct() {
		return product;
	}
}
