package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.example;

class Subtract implements Expression {

	private Expression leftExpression;

	private Expression rightExpression;

	public Subtract(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() - rightExpression.interpret();
	}
}
