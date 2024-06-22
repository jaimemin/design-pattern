package com.tistory.jaimemin.designpattern.structural_patterns.bridge.example;

class Assemble implements Workshop {
	
	@Override
	public void work() {
		System.out.print(" And");
		System.out.println(" Assembled.");
	}
}
