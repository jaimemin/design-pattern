package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.example;

public abstract class Handler {
	
	protected Handler nextHandler;

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handleRequest(String request);
}
