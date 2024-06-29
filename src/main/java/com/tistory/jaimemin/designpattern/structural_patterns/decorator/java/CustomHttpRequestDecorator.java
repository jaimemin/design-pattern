package com.tistory.jaimemin.designpattern.structural_patterns.decorator.java;

import java.nio.charset.StandardCharsets;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class CustomHttpRequestDecorator extends ServerHttpRequestDecorator {

	public CustomHttpRequestDecorator(ServerHttpRequest delegate) {
		super(delegate);
	}

	@Override
	public Flux<DataBuffer> getBody() {
		Flux<DataBuffer> flux = super.getBody();

		// ex) ResponseBody를 로깅
		return flux.map(dataBuffer -> {
			log.info("Request body: " + dataBuffer.toString(StandardCharsets.UTF_8));

			return dataBuffer;
		});
	}
}

