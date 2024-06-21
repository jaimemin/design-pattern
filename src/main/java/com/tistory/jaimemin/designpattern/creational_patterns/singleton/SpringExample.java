package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		String hello = applicationContext.getBean("hello", String.class);
		String hello2 = applicationContext.getBean("hello", String.class);

		/**
		 * singleton scope
		 * 엄밀히 말하자면 singleton pattern과는 다름
		 */
		System.out.println(hello == hello2);
	}
}
