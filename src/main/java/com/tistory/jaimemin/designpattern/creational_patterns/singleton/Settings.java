package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

	private static final Long serialVersionUID = 1L;

	private static Settings instance;

	/**
	 * 클래스 밖에서 생성자를 호출할 수 없으므로 인스턴스 생성 불가능
	 */
	private Settings() {}

	/**
	 * 가장 간단하게 멀티 쓰레드 환경에서 thread-safe 하게 만드는 방법
	 * 락 획득을 하기 때문에 성능 저하 발생할 수 있음
	 */
	public static synchronized Settings getInstance() {
		if (instance == null) {
			instance = new Settings();
		}

		return instance;
	}

	/**
	 * Settings 클래스 안에서 인스턴스를 만들고 글로벌하게 접근할 수 있게 해야함
	 * 하지만 이 방법은 멀티 쓰레드 환경에서 thread-safe하지 않음
	 * 찰나의 순간에 두 개 이상의 쓰레드가 if문 조건을 통과하고 생성자를 통해 인스턴스 생성 가능
	 */
	// public static Settings getInstance() {
	// 	if (instance == null) {
	// 		instance = new Settings();
	// 	}
	//
	// 	return instance;
	// }

	/**
	 * 역직렬화 대응을 위한 방법
	 */
	protected Object readResolve() {
		return instance;
	}
}
