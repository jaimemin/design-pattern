package com.tistory.jaimemin.designpattern.factorymethod.java;

import com.tistory.jaimemin.designpattern.factorymethod.after.Blackship;
import com.tistory.jaimemin.designpattern.factorymethod.after.Whiteship;

/**
 * 단순한 팩토리 패턴
 *
 * 매개변수의 값에 따라 각기 다른 인스턴스를 반호나하는 단순한 버전의 팩토리 패턴
 */
public class SimpleFactory {

	public Object createProduct(String name) {
		if (name.equals("whiteship")) {
			return new Whiteship();
		} else if (name.equals("blackship")) {
			return new Blackship();
		}

		throw new IllegalArgumentException();
	}
}
