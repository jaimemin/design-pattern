package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.example;

public class ShoppingCartVisitor implements Visitor {

	@Override
	public int visit(Book book) {
		int cost = 0;

		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}

		System.out.println("책 ISBN::" + book.getIsbnNumber() + ", 가격 = " + cost);

		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " 가격 = " + cost);

		return cost;
	}

}
