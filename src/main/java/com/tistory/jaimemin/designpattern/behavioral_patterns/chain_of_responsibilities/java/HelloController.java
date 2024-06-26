package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
