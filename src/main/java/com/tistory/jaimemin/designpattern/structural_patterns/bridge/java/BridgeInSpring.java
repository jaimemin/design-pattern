package com.tistory.jaimemin.designpattern.structural_patterns.bridge.java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {

	/**
	 * 구체적인 구현체의 인터페이스를 Spring에서는 PortableServiceImpl로 많이 만들어 놓음
	 *
	 * TransactionTemplate이 Abstract 쪽
	 * PlatformTransactionManager가 Impl 쪽
	 */
	public static void main(String[] args) {
		MailSender mailSender = new JavaMailSenderImpl(); // Concrete Implementation

		PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager(); // Concrete Implementation
	}
}
