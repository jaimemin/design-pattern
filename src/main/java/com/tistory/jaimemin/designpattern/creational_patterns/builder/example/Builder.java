package com.tistory.jaimemin.designpattern.creational_patterns.builder.example;

public interface Builder {

	Builder buildPartA(String s);

	Builder buildPartB(String s);

	Product getProduct();
}
