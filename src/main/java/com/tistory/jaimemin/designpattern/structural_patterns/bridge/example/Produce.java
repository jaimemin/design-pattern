package com.tistory.jaimemin.designpattern.structural_patterns.bridge.example;

class Produce implements Workshop {
	
	@Override
	public void work() {
		System.out.print("Produced");
	}
}
