package com.tistory.jaimemin.designpattern.structural_patterns.proxy.after;

public class Client {

	public static void main(String[] args) {
		GameService gameService = new GameServiceProxy();
		gameService.startGame();
	}
}
