package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

	private Character character;

	public VariableExpression(Character character) {
		this.character = character;
	}

	@Override
	public int interpret(Map<Character, Integer> context) {
		return context.get(this.character);
	}
}
