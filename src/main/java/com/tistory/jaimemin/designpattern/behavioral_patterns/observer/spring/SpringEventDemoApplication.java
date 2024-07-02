package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringEventDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			EventPublisher publisher = ctx.getBean(EventPublisher.class);
			publisher.publishEvent("커스텀 이벤트!");
		};
	}
}
