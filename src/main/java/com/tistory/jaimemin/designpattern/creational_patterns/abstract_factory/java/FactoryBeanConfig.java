package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

	@Bean
	public ShipFactory shipFactory() {
		return new ShipFactory();
	}
}
