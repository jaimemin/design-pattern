package com.tistory.jaimemin.designpattern.behavioral_patterns.state.example;

class TcpConnectionContext {

	private State currentState;

	public TcpConnectionContext() {
		currentState = new TcpClosedState();
	}

	public void setState(State state) {
		currentState = state;
	}

	public void request() {
		currentState.handleRequest();
	}
}
