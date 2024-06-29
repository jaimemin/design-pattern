package com.tistory.jaimemin.designpattern.behavioral_patterns.memento.example;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("상태 #1");
		originator.setState("상태 #2");
		caretaker.add(originator.saveStateToMemento());

		originator.setState("상태 #3");
		caretaker.add(originator.saveStateToMemento());

		originator.setState("상태 #4");
		System.out.println("현재 상태: " + originator.getState());

		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("첫 번째 상태 복원: " + originator.getState());
		originator.getStateFromMemento(caretaker.get(1));
		System.out.println("두 번째 상태 복원: " + originator.getState());
	}
}
