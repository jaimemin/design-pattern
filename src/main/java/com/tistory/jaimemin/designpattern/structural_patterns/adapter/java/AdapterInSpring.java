package com.tistory.jaimemin.designpattern.structural_patterns.adapter.java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

	public static void main(String[] args) {
		/**
		 * doDispatch > getHandlerAdapter(Object handler)
		 * Handler가 다양하기 때문에 handler는 단순히 HandlerAdapter 인터페이스만 구현하면 됨
		 * -> ModelAndView를 반환하는 handle 재정의해주면 됨
		 */
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter(); // handler가 다양한 형태
	}
}
