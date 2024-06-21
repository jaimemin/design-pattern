package com.tistory.jaimemin.designpattern.builder.example;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {

	private String name;

	private int age;

	private String email;

	public static void main(String[] args) {
		User user = User.builder()
			.name("jaimemin")
			.age(29)
			.email("example@example.com")
			.build();

		System.out.println(user);
	}
}