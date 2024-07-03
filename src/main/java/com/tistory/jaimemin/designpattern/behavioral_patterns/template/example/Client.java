package com.tistory.jaimemin.designpattern.behavioral_patterns.template.example;

public class Client {

	public static void main(String[] args) {
		Game game = new Soccer();
		game.play();
		System.out.println();

		game = new BasketBall();
		game.play();
	}
}
