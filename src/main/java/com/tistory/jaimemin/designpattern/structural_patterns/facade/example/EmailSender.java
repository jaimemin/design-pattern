package com.tistory.jaimemin.designpattern.structural_patterns.facade.example;

import jakarta.mail.MessagingException;
import jakarta.mail.Transport;
import jakarta.mail.internet.MimeMessage;

class EmailSender {

	public void sendEmail(MimeMessage message) throws MessagingException {
		Transport.send(message);
	}
}
