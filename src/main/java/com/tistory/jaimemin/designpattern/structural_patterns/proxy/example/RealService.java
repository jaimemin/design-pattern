package com.tistory.jaimemin.designpattern.structural_patterns.proxy.example;

public class RealService implements Service {

	@Override
	public void func() {
		System.out.println("RealService func");
	}
}
