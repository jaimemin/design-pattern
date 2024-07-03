package com.tistory.jaimemin.designpattern.behavioral_patterns.template.example;

public class BasketBall extends Game {

	@Override
	void initialize() {
		System.out.println("농구 게임 환경 설정 완료!");
	}

	@Override
	void startPlay() {
		System.out.println("농구 게임 시작");
	}

	@Override
	void endPlay() {
		System.out.println("농구 게임 끝");
	}
}