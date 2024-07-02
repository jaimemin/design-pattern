package com.tistory.jaimemin.designpattern.behavioral_patterns.observer.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void publishEvent(String message) {
		CustomEvent customEvent = new CustomEvent(this, message);
		applicationEventPublisher.publishEvent(customEvent);
	}
}
