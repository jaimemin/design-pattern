package com.tistory.jaimemin.designpattern.behavioral_patterns.template.example;

abstract class Game {

	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}

	abstract void initialize();

	abstract void startPlay();
	
	abstract void endPlay();
}
