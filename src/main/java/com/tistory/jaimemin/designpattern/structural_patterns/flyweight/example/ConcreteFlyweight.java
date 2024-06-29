package com.tistory.jaimemin.designpattern.structural_patterns.flyweight.example;

class ConcreteFlyweight implements Flyweight {

	private final String intrinsicState;

	public ConcreteFlyweight(String intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String extrinsicState) {
		System.out.println(String.format("변하지 않는 속성 %s, 자주 변하는 속성 %s", intrinsicState, extrinsicState));
	}
}
