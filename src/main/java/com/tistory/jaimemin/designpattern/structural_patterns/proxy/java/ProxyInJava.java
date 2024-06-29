package com.tistory.jaimemin.designpattern.structural_patterns.proxy.java;

import java.lang.reflect.Proxy;

import com.tistory.jaimemin.designpattern.structural_patterns.proxy.after.DefaultGameService;
import com.tistory.jaimemin.designpattern.structural_patterns.proxy.after.GameService;

public class ProxyInJava {

	public static void main(String[] args) {
		ProxyInJava proxyInJava = new ProxyInJava();
		proxyInJava.dynamicProxy();
	}

	private void dynamicProxy() {
		GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
		gameServiceProxy.startGame();
	}

	private GameService getGameServiceProxy(GameService target) {
		return (GameService)Proxy.newProxyInstance(this.getClass().getClassLoader(),
			new Class[] {GameService.class}, (proxy, method, args) -> {
				System.out.println("O");
				method.invoke(target, args);
				System.out.println("ㅁ");
				return null;
			});
	}
}
