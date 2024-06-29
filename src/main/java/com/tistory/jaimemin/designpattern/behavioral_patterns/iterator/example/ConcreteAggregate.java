package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.example;

import java.util.ArrayList;
import java.util.List;

class ConcreteAggregate<T> implements Aggregate<T> {

	private List<T> items = new ArrayList<>();

	public void addItem(T item) {
		items.add(item);
	}

	public T getItem(int index) {
		return items.get(index);
	}

	public int getSize() {
		return items.size();
	}

	@Override
	public Iterator<T> createIterator() {
		return new ConcreteIterator<>(items);
	}
}
