package com.tistory.jaimemin.designpattern.behavioral_patterns.memento.example;

public class Memento {

	private final String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
