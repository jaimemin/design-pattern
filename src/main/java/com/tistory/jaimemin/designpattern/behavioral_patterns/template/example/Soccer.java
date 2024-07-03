package com.tistory.jaimemin.designpattern.behavioral_patterns.template.example;

class Soccer extends Game {

	@Override
	void initialize() {
		System.out.println("축구 게임 환경 설정 완료!");
	}

	@Override
	void startPlay() {
		System.out.println("축구 게임 시작");
	}

	@Override
	void endPlay() {
		System.out.println("축구 게임 끝");
	}
}
