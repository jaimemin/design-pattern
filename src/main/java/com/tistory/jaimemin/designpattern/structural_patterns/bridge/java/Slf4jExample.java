package com.tistory.jaimemin.designpattern.structural_patterns.bridge.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

	/**
	 * Logging Facade (추상화되어 있는 계층 구조)
	 * 패턴은 보는 시각 관점에 따라 다른 패턴이라고 할 수 있음
	 * LoggerFactory, Logger
	 *
	 * 클라이언트가 원하는 Logger를 선택할 수 있는 권리 부여
	 */
	private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

	public static void main(String[] args) {
		logger.info("hello logger");
	}
}
