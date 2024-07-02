package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.java;

import java.util.concurrent.Flow;

public class NewsSubscriber implements Flow.Subscriber<String> {

	private Flow.Subscription subscription;

	@Override
	public void onSubscribe(Flow.Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1); // 처음 요청 시 1개의 아이템 요청
	}

	@Override
	public void onNext(String item) {
		System.out.println("뉴스 수신: " + item);
		subscription.request(1); // 다음 아이템 요청
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	@Override
	public void onComplete() {
		System.out.println("모든 뉴스 수신 완료");
	}
}

