package com.tistory.jaimemin.designpattern.behavioral_patterns.strategy.example;

public class Client {

	public static void main(String[] args) {
		int[] numbers = {3, 5, 2, 9, 1};

		SortingContext context = new SortingContext(new BubbleSortStrategy());
		context.performSort(numbers);
		printArray(numbers);

		context.setSortingStrategy(new QuickSortStrategy());
		context.performSort(numbers);
		printArray(numbers);

		context.setSortingStrategy(new MergeSortStrategy());
		context.performSort(numbers);
		printArray(numbers);
	}

	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
	}
}
