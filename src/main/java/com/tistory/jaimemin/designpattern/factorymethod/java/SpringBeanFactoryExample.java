package com.tistory.jaimemin.designpattern.factorymethod.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 스프링 BeanFactory
 *
 * Object 타입의 Product를 만드는 (스프링의 핵심인 IoC 컨테이너에 해당하는) BeanFactory 라는 Creator
 */
public class SpringBeanFactoryExample {

	public static void main(String[] args) {
		BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
		String hi = javaFactory.getBean("hello", String.class);
		System.out.println(hi);
	}
}