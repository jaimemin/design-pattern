package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

public class EagerSettings {

	/**
	 * 인스턴스 생성 비용이 상대적으로 비싸지 않다면 eager initialization 적용
	 * 미리 만든다는 그 자체가 단점이 될 수도 있음 (생성하는데 오래 걸리고 메모리를 많이 사용하는 등 리소스 소모가 많다면...)
	 */
	private static final EagerSettings INSTANCE = new EagerSettings();

	private EagerSettings() {}

	/**
	 * 여러 쓰레드가 접근해도 단순히 INSTANCE 반환하므로 thread-safe
	 */
	public static EagerSettings getInstance() {
		return INSTANCE;
	}
}
