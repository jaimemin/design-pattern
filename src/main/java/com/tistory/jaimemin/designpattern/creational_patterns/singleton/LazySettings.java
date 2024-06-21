package com.tistory.jaimemin.designpattern.creational_patterns.singleton;

public class LazySettings {

	private LazySettings() {}

	private static class LazySettingsHolder {
		private static final LazySettings INSTANCE = new LazySettings();
	}

	/**
	 * 멀티 쓰레드 환경에서 thread-safe하고
	 * getInstance가 호출될 때 LazySettingsHolder가 로딩되고 그때 Instance가 만들어져 Lazy Loading
	 * DoubleCheckedLockingSettings보다 이해하기 쉬움
	 */
	public static LazySettings getInstance() {
		return LazySettingsHolder.INSTANCE;
	}
}
