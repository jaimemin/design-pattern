package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.example;

public class Client {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] {new Book(20, "1234"),
			new Book(100, "5678"),
			new Fruit(10, 2, "바나나"),
			new Fruit(5, 5, "사과")};

		int total = calculatePrice(items);
		System.out.println("가격 합산 = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		Visitor visitor = new ShoppingCartVisitor();
		int sum = 0;

		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}

		return sum;
	}
}
