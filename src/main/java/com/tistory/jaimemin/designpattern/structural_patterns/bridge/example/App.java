package com.tistory.jaimemin.designpattern.structural_patterns.bridge.example;

public class App {

	public static void main(String[] args) {
		Vehicle vehicle = new Car(new Produce(), new Assemble());
		vehicle.manufacture();

		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
