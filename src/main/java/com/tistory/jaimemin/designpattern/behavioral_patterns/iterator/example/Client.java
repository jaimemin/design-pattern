package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.example;

public class Client {

	public static void main(String[] args) {
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
		aggregate.addItem("아이템 1");
		aggregate.addItem("아이템 2");
		aggregate.addItem("아이템 3");

		Iterator<String> iterator = aggregate.createIterator();

		while (iterator.hasNext()) {
			String item = iterator.next();

			System.out.println(item);
		}
	}
}
