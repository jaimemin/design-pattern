package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.java;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
		ServletException {
		System.out.println("게임에 참하신 여러분 모두 진심으로 환영합니다.");
		chain.doFilter(request, response);
		System.out.println("꽝!");
	}
}
