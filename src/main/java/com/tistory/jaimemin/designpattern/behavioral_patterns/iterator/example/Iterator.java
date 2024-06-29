package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.example;

interface Iterator<T> {

	boolean hasNext();

	T next();
}