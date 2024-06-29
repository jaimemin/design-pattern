package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.example;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		handler1.setNextHandler(handler2);

		handler1.handleRequest("요청1");
		handler1.handleRequest("요청2");
		handler1.handleRequest("알 수 없는 요청");
	}
}
