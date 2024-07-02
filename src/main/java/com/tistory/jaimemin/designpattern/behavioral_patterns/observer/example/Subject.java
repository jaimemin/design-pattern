package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.example;

public interface Subject {

	void registerObserver(Observer o);

	void unregisterObserver(Observer o);

	void notifyObservers();
}

