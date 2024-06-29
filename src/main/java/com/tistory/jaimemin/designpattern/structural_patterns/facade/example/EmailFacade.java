package com.tistory.jaimemin.designpattern.structural_patterns.facade.example;

import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class EmailFacade {

	private SmtpServer smtpServer;

	private EmailSender emailSender;

	public EmailFacade(String host, String port, String username, String password) {
		smtpServer = new SmtpServer(host, port, username, password);
		emailSender = new EmailSender();
	}

	public void sendEmail(String from, String to, String subject, String body) {
		try {
			Session session = smtpServer.getSession();
			EmailMessage emailMessage = new EmailMessage(session, from, to, subject, body);
			emailSender.sendEmail(emailMessage.getMessage());

			log.info("Email sent successfully.");
		} catch (MessagingException e) {
			log.error("Failed to send email.");
		}
	}
}
