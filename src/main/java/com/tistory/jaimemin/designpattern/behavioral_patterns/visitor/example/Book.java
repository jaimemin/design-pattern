package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.example;

class Book implements ItemElement {

	private int price;

	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
