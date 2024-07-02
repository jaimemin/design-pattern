package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.java;

public class Client {

	public static void main(String[] args) {
		NewsPublisher newsPublisher = new NewsPublisher();
		NewsSubscriber newsSubscriber = new NewsSubscriber();
		newsPublisher.subscribe(newsSubscriber);

		newsPublisher.publishNews("뉴스 1!");
		newsPublisher.publishNews("뉴스 2");

		newsPublisher.close();
	}
}
