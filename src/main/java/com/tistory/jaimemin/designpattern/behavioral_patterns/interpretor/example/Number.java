package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.example;

class Number implements Expression {
	
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}
}
