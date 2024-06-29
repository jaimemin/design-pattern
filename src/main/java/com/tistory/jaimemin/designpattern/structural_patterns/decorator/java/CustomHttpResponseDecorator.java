package com.tistory.jaimemin.designpattern.structural_patterns.decorator.java;

import java.nio.charset.StandardCharsets;

import org.reactivestreams.Publisher;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public class CustomHttpResponseDecorator extends ServerHttpResponseDecorator {

	public CustomHttpResponseDecorator(ServerHttpResponse delegate) {
		super(delegate);
	}

	@Override
	public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
		// ex) ResponseBody를 로깅
		return super.writeWith(Flux.from(body).map(dataBuffer -> {
			log.info("Response body: " + dataBuffer.toString(StandardCharsets.UTF_8));

			return dataBuffer;
		}));
	}
}

