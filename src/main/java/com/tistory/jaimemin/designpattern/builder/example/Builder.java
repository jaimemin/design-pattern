package com.tistory.jaimemin.designpattern.builder.example;

public interface Builder {

	Builder buildPartA(String s);

	Builder buildPartB(String s);

	Product getProduct();
}
