package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.after;

public class Triangle implements Shape {

	@Override
	public void accept(Device device) {
		device.print(this);
	}
}
