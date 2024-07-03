package com.tistory.jaimemin.designpattern.behavioral_patterns.strategy.before;

public class Client {

	public static void main(String[] args) {
		BlueLightRedLight blueLightRedLight = new BlueLightRedLight(3);
		blueLightRedLight.blueLight();
		blueLightRedLight.redLight();
	}
}
