package com.tistory.jaimemin.designpattern.behavioral_patterns.chain_of_responsibilities.java;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class CoRInJava {

	public static void main(String[] args) {
		Filter filter = new Filter() {
			@Override
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws
				IOException,
				ServletException {
				// TODO 전처리
				chain.doFilter(request, response);
				// TODO 후처리
			}
		};
	}
}
