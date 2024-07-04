package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.after;

public class Rectangle implements Shape {

	@Override
	public void accept(Device device) {
		device.print(this);
	}
}
