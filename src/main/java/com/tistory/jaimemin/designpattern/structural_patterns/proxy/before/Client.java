package com.tistory.jaimemin.designpattern.structural_patterns.proxy.before;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		GameService gameService = new GameService();
		gameService.startGame();
	}
}
