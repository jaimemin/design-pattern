package com.tistory.jaimemin.designpattern.creational_patterns.prototype.example;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class ConcretePrototype implements Prototype {

	private String field;

	public ConcretePrototype(String field) throws InterruptedException {
		Thread.sleep(5000); // 생성 비용이 비싸 5초 걸린다고 가정

		this.field = field;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
