package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.example;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {

	private int runs;

	private int wickets;

	private float overs;

	private List<Observer> observers;

	public CricketData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(runs, wickets, overs);
		}
	}

	private int getLatestRuns() {
		return 90;
	}

	private int getLatestWickets() {
		return 2;
	}

	private float getLatestOvers() {
		return 10.2f;
	}

	public void dataChanged() {
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		notifyObservers();
	}
}

