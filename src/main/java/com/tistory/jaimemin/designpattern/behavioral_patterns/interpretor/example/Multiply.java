package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.example;

class Multiply implements Expression {

	private Expression leftExpression;

	private Expression rightExpression;

	public Multiply(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}
}
