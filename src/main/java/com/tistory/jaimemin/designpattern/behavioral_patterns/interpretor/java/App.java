package com.tistory.jaimemin.designpattern.behavioral_patterns.interpretor.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}
}
