package com.tistory.jaimemin.designpattern.behavioral_patterns.mediator.example;

class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + "가 보내는 메시지: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + "가 받은 메시지: " + message);
	}
}
