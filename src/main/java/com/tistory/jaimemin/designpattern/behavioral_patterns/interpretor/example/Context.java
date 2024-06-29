package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.example;

class Context {

	private String expression;

	public Context(String expression) {
		this.expression = expression;
	}

	public Expression evaluate() {
		int pos = expression.length() - 1;

		while (pos > 0) {
			if (Character.isDigit(expression.charAt(pos))) {
				pos--;
			} else {
				Expression left = new Number(Integer.parseInt(expression.substring(0, pos)));
				Expression right = new Number(Integer.parseInt(expression.substring(pos + 1)));
				char operator = expression.charAt(pos);

				switch (operator) {
					case '+':
						return new Add(left, right);
					case '-':
						return new Subtract(left, right);
					case '*':
						return new Multiply(left, right);
				}
			}
		}

		return new Number(Integer.parseInt(expression));
	}
}