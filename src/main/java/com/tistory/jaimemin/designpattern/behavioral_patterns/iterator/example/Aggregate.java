package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.example;

interface Aggregate<T> {

	Iterator<T> createIterator();
}