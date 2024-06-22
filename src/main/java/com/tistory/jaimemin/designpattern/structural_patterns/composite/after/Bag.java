package com.tistory.jaimemin.designpattern.structural_patterns.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 가격을 구하는 주체가 Client에서 Bag로 위임됨
 * 객체지향적인 관점에서 올바른 변경 (Client가 너무 많은 것을 알지 않아도 됨)
 */
public class Bag implements Component {

	private List<Component> components = new ArrayList<>(); // Item이 아니라 Component를 참조해야 함

	public void add(Component component) {
		components.add(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	@Override
	public int getPrice() {
		return components.stream()
			.mapToInt(Component::getPrice)
			.sum();
	}
}
