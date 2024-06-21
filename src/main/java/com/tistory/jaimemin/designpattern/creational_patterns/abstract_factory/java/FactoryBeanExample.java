package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.Ship;

/**
 * 프레임워크를 만드는 쪽에 보통 추상 팩토리 메서드 패턴 혹은 추상 팩토리 패턴이 많이 적용되어 있음
 * 스프링 프레임워크 내부 코드는 바뀌지 않으면서 확장 가능하기 때문에 OCP 원칙을 따랐다고 할 수 있음
 */
public class FactoryBeanExample {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
		System.out.println(whiteship.getName());

		/**
		 * 자바 설정으로는 FactoryBean이 크게 의미 없음
		 */
		// ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
		// Ship bean = applicationContext.getBean(Ship.class);
		// System.out.println(bean);
	}
}
