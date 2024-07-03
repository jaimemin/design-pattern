package com.tistory.jaimemin.designpattern.behavioral_patterns.strategy.example;

public class MergeSortStrategy implements SortingStrategy {
	@Override
	public void sort(int[] numbers) {
		mergeSort(numbers, numbers.length);
		System.out.println("병합 정렬");
	}

	private void mergeSort(int[] arr, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}

		mergeSort(left, mid);
		mergeSort(right, n - mid);
		merge(arr, left, right, mid, n - mid);
	}

	private void merge(int[] arr, int[] left, int[] right, int leftLength, int rightLength) {
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		while (i < leftLength) {
			arr[k++] = left[i++];
		}

		while (j < rightLength) {
			arr[k++] = right[j++];
		}
	}
}
