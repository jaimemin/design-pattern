package com.tistory.jaimemin.designpattern.behavioral_patterns.memento.java;

import java.io.Serializable;

class Originator implements Serializable {

	private static final long serialVersionUID = 1L;

	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

	// 내부 클래스로 Memento 구현
	public static class Memento implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private final String state;

		public Memento(String state) {
			this.state = state;
		}

		public String getState() {
			return state;
		}
	}
}
