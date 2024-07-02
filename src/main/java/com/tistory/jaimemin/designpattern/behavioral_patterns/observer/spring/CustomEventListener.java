package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.spring;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {

	@EventListener
	public void handleCustomEvent(CustomEvent event) {
		System.out.println("커스텀 이벤트 수신 - " + event.getMessage());
	}
}
