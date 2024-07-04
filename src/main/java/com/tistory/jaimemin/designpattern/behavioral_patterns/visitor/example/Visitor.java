package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.example;

interface Visitor {

	int visit(Book book);

	int visit(Fruit fruit);
}
