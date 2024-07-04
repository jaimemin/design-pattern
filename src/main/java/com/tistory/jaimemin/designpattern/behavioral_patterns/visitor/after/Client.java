package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.after;

public class Client {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Device device = new Pad();
		rectangle.accept(device);
	}
}
