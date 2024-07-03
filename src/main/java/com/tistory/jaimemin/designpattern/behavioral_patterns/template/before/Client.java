package com.tistory.jaimemin.designpattern.behavioral_patterns.template.before;

public class Client {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor("number.txt");
		int result = fileProcessor.process();
		System.out.println(result);
	}
}
