package com.tistory.jaimemin.designpattern.behavioral_patterns.memento.java;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		try {
			Originator originator = new Originator();
			Caretaker caretaker = new Caretaker();
			originator.setState("상태 #1");
			System.out.println("현재 상태: " + originator.getState());

			Originator.Memento memento1 = originator.saveStateToMemento();
			caretaker.saveMemento(memento1, "memento1.ser");

			originator.setState("상태 #2");
			System.out.println("현재 상태: " + originator.getState());

			Originator.Memento memento2 = originator.saveStateToMemento();
			caretaker.saveMemento(memento2, "memento2.ser");

			// 상태 복원
			Originator.Memento restoredMemento1 = caretaker.loadMemento("memento1.ser");
			originator.getStateFromMemento(restoredMemento1);
			System.out.println("첫 번째 상태 복원: " + originator.getState());

			Originator.Memento restoredMemento2 = caretaker.loadMemento("memento2.ser");
			originator.getStateFromMemento(restoredMemento2);
			System.out.println("두 번째 상태 복원: " + originator.getState());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
