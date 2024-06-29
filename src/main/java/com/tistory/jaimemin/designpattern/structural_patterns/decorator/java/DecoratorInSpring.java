package com.tistory.jaimemin.designpattern.structural_patterns.decorator.java;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {

	public static void main(String[] args) {
		// 빈 설정 데코레이터
		BeanDefinitionDecorator decorator; // 직접적으로 쓸 일이 없음

		// 웹플럭스 HTTP 요청 /응답 데코레이터
		// webflux 쓴다면 쓸 일이 있음 (WebFilter)
		ServerHttpRequestDecorator httpRequestDecorator;
		ServerHttpResponseDecorator httpResponseDecorator;
	}
}
