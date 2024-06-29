package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.example;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(String request) {
		if (request.equals("요청2")) {
			System.out.println("ConcreteHandler2가 요청을 처리합니다.");
		} else if (nextHandler != null) {
			nextHandler.handleRequest(request);
		}
	}
}
