package com.tistory.jaimemin.designpattern.structural_patterns.proxy.example;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

	public static void main(String[] args) {
		Service realService = new RealService();
		// InvocationHandler 생성
		ServiceInvocationHandler handler = new ServiceInvocationHandler(realService);
		// 프록시 객체 생성
		Service proxyInstance = (Service)Proxy.newProxyInstance(
			realService.getClass().getClassLoader(),
			new Class<?>[] {Service.class},
			handler
		);

		proxyInstance.func();
	}
}
