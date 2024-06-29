package com.tistory.jaimemin.designpattern.structural_patterns.facade.example;

public class Client {

	public static void main(String[] args) {
		String host = "<host>";
		String port = "<port>>";
		String username = "<username>";
		String password = "<password>";

		// 이메일 정보
		String from = "<your-email>";
		String to = "<recipient-email>";
		String subject = "파사드 패턴 테스트";
		String body = "테스트 이메일";
		
		EmailFacade emailFacade = new EmailFacade(host, port, username, password);
		emailFacade.sendEmail(from, to, subject, body);
	}
}
