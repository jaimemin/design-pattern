package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.java;

import java.util.concurrent.SubmissionPublisher;

public class NewsPublisher extends SubmissionPublisher<String> {

	public void publishNews(String news) {
		System.out.println("뉴스 발행: " + news);
		submit(news);
	}
}

