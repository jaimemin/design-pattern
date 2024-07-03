package com.tistory.jaimemin.designpattern.behavioral_patterns.strategy.example;

public class SortingContext {
	
	private SortingStrategy sortingStrategy;

	public SortingContext(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void performSort(int[] numbers) {
		sortingStrategy.sort(numbers);
	}
}

