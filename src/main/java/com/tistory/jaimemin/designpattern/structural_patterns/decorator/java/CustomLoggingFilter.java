package com.tistory.jaimemin.designpattern.structural_patterns.decorator.java;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class CustomLoggingFilter implements WebFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		// 요청과 응답을 데코레이터로 래핑
		CustomHttpRequestDecorator requestDecorator = new CustomHttpRequestDecorator(exchange.getRequest());
		CustomHttpResponseDecorator responseDecorator = new CustomHttpResponseDecorator(exchange.getResponse());

		return chain.filter(exchange.mutate()
			.request(requestDecorator)
			.response(responseDecorator)
			.build());
	}
}
