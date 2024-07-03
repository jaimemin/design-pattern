package com.tistory.jaimemin.designpattern.behavioral_patterns.state.example;

public class Client {

	public static void main(String[] args) {
		TcpConnectionContext context = new TcpConnectionContext();
		context.request();

		context.setState(new TcpEstablishedState());
		context.request();

		context.setState(new TcpListenState());
		context.request();
	}
}
