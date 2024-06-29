package com.tistory.jaimemin.designpattern.behavioral_patterns.mediator.example;

import java.util.ArrayList;
import java.util.List;

class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : this.users) {
			// 메시지를 보낸 사용자를 제외한 모든 사용자에게 메시지를 전달합니다.
			if (u != user) {
				u.receive(message);
			}
		}
	}
}
