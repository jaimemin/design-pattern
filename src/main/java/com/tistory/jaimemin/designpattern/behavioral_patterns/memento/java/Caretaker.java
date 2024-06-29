package com.tistory.jaimemin.designpattern.behavioral_patterns.memento.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Caretaker {

	public void saveMemento(Originator.Memento memento, String filename) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(memento);
		}
	}

	public Originator.Memento loadMemento(String filename) throws IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			return (Originator.Memento)ois.readObject();
		}
	}
}
