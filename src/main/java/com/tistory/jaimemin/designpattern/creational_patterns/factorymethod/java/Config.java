package com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public String hello() {
		return "hello";
	}

}
