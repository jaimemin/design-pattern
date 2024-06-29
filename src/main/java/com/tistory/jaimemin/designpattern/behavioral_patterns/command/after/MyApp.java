package com.tistory.jaimemin.designpattern.behavioral_patterns.command.after;

import com.tistory.jaimemin.designpattern.behavioral_patterns.command.before.Game;

public class MyApp {

	private Command command;

	public MyApp(Command command) {
		this.command = command;
	}

	public void press() {
		command.execute();
	}

	public static void main(String[] args) {
		MyApp myApp = new MyApp(new GameStartCommand(new Game()));
	}
}
