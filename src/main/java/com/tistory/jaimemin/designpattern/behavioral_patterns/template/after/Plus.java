package com.tistory.jaimemin.designpattern.behavioral_patterns.template.after;

public class Plus implements Operator {
	@Override
	public int getResult(int result, int number) {
		return result += number;
	}
}
