package com.tistory.jaimemin.designpattern.behavioral_patterns.mediator.example;

interface ChatMediator {

	void sendMessage(String message, User user);
	
	void addUser(User user);
}
