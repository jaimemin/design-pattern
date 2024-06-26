package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("example.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person);
	}
}
