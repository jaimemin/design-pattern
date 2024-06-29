package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.example;

import java.util.List;

class ConcreteIterator<T> implements Iterator<T> {

	private List<T> collection;

	private int position = 0;

	public ConcreteIterator(List<T> collection) {
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return position < collection.size();
	}

	@Override
	public T next() {
		return collection.get(position++);
	}
}
