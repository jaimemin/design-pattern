package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.example;

public class Client {

	public static void main(String[] args) {
		CricketData cricketData = new CricketData();
		CurrentScore currentScore = new CurrentScore();
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		cricketData.registerObserver(currentScore);
		cricketData.registerObserver(averageScoreDisplay);
		cricketData.dataChanged();
	}
}
