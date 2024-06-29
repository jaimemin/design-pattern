package com.tistory.jaimemin.designpattern.structural_patterns.facade.example;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

class EmailMessage {

	private MimeMessage message;

	public EmailMessage(Session session, String from, String to, String subject, String body) throws
		MessagingException {
		message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject(subject);
		message.setText(body);
	}

	public MimeMessage getMessage() {
		return message;
	}
}
