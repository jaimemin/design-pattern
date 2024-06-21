package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

/**
 * 자바 1.5부터 동작하는 코드 (이전 버전은 동작하지 않음)
 */
public class DoubleCheckedLockingSettings {

	/**
	 * volatile 키워드를 붙여야함
	 */
	private static volatile DoubleCheckedLockingSettings instance;

	private DoubleCheckedLockingSettings() {}

	/**
	 * 다수의 쓰레드가 동시에 if문을 통과하더라도 syncrhonized 구문에서 한 번 더 체크하므로
	 * thread-safe
	 *
	 * Settings 대비 성능 관점에서 유리
	 * -> instance가 null일 때만 synchronized 구문 접근
	 * 인스턴스를 필요로 하는 시점에 만들 수 있다는 것도 장점
	 */
	public static DoubleCheckedLockingSettings getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSettings.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSettings();
				}
			}
		}

		return instance;
	}
}
