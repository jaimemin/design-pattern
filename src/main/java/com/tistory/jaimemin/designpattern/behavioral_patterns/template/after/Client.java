package com.tistory.jaimemin.designpattern.behavioral_patterns.template.after;

public class Client {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new Multiply("number.txt");
		int result = fileProcessor.process((sum, number) -> sum += number);
		System.out.println(result);
	}
}
