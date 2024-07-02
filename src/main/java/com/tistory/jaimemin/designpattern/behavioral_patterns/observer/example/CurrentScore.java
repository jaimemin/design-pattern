package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.example;

public class CurrentScore implements Observer {

	private int runs;

	private int wickets;

	private float overs;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out.println("현재 점수 출력");
		System.out.println("Runs: " + runs);
		System.out.println("Wickets: " + wickets);
		System.out.println("Overs: " + overs);
	}
}

