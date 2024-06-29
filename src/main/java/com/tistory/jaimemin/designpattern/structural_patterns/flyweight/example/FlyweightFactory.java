package com.tistory.jaimemin.designpattern.structural_patterns.flyweight.example;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {

	private final Map<String, Flyweight> flyweightPool = new HashMap<>();

	public Flyweight getFlyweight(String intrinsicState) {
		if (!flyweightPool.containsKey(intrinsicState)) {
			flyweightPool.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
		}

		return flyweightPool.get(intrinsicState);
	}
}
