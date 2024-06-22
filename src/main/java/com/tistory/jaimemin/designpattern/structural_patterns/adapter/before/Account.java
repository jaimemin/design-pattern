package com.tistory.jaimemin.designpattern.structural_patterns.adapter.before;

/**
 * Adaptee
 * security 패키지와 뭄관한 클래스
 * 애플리케이션에 맞게끔 구성한 클래스
 */
public class Account {

	private String name;

	private String password;

	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
