package com.tistory.jaimemin.designpattern.behavioral_patterns.state.example;

class TcpClosedState implements State {

	public void handleRequest() {
		System.out.println("TCP 연결 닫힌 상태");
	}
}
