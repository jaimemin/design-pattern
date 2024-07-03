package com.tistory.jaimemin.designpattern.behavioral_patterns.state.example;

class TcpEstablishedState implements State {

	public void handleRequest() {
		System.out.println("TCP 연결 성공");
	}
}
