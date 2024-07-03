package com.tistory.jaimemin.designpattern.behavioral_patterns.template.java;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.RestTemplate;

public class TemplateInSpring {

	public static void main(String[] args) {
		// TODO 템플릿-콜백 패턴
		// JdbcTemplate
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.execute("insert");

		// RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("X-COM-PERSIST", "NO");
		headers.set("X-COM-LOCATION", "USA");

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity = restTemplate
			.exchange("http://localhost:8080/users", HttpMethod.GET, entity, String.class);
	}

	@Configuration
	class SecurityConfig {

		@Bean
		public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http
				.authorizeHttpRequests(authorizeRequests ->
					authorizeRequests.anyRequest().permitAll()
				);

			return http.build();
		}
	}
}
