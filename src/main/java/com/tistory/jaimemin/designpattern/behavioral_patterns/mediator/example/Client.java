package com.tistory.jaimemin.designpattern.behavioral_patterns.mediator.example;

public class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User chulsoo = new UserImpl(mediator, "철수");
		User hooni = new UserImpl(mediator, "훈이");
		User zzanggu = new UserImpl(mediator, "짱구");
		User maenggu = new UserImpl(mediator, "맹구");
		User yuri = new UserImpl(mediator, "유리");
		mediator.addUser(chulsoo);
		mediator.addUser(hooni);
		mediator.addUser(zzanggu);
		mediator.addUser(maenggu);
		mediator.addUser(yuri);

		chulsoo.send("안녕하세요, 여러분!");
	}
}
