package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.CompositeIterator;

public class IteratorInSpring {

	public static void main(String[] args) {
		List<String> databaseResults = Arrays.asList("DB Record 1", "DB Record 2");
		List<String> fileResults = Arrays.asList("File Record 1", "File Record 2", "File Record 3");
		List<String> apiResults = Arrays.asList("API Record 1", "API Record 2");

		List<Iterator<String>> iterators = new ArrayList<>();
		iterators.add(databaseResults.iterator());
		iterators.add(fileResults.iterator());
		iterators.add(apiResults.iterator());

		CompositeIterator<String> compositeIterator = new CompositeIterator<>();

		for (Iterator<String> iterator : iterators) {
			compositeIterator.add(iterator);
		}

		while (compositeIterator.hasNext()) {
			System.out.println(compositeIterator.next());
		}
	}
}
