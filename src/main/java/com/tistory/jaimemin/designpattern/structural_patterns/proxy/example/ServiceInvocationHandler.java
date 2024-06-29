package com.tistory.jaimemin.designpattern.structural_patterns.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceInvocationHandler implements InvocationHandler {

	private final Object realService;

	public ServiceInvocationHandler(final Object realService) {
		this.realService = realService;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before invoking " + method.getName());
		Object result = method.invoke(realService, args);
		System.out.println("After invoking " + method.getName());

		return result;
	}
}
