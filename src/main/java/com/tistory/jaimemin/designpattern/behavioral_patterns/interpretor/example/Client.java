package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.example;

public class Client {

	public static void main(String[] args) {
		String expression = "15*31";
		Context context = new Context(expression);
		Expression exp = context.evaluate();

		System.out.println(expression + " = " + exp.interpret());
	}
}
