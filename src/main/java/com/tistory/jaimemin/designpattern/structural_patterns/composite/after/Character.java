package com.tistory.jaimemin.designpattern.structural_patterns.composite.after;

public class Character implements Component {

	private Bag bag;

	@Override
	public int getPrice() {
		return bag.getPrice();
	}

}
