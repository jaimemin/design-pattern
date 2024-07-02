package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.example;

public class AverageScoreDisplay implements Observer {

	private float runRate;

	private int predictedScore;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float)runs / overs;
		this.predictedScore = (int)(runRate * 50);
		display();
	}

	public void display() {
		System.out.println("평균 점수 및 예상 점수 출력");
		System.out.println("Run Rate: " + runRate);
		System.out.println("예상 점수: " + predictedScore);
	}
}

