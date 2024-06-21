package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public String hello() {
		return "hello";
	}
}
