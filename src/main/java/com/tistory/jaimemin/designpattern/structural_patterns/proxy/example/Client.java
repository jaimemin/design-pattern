package com.tistory.jaimemin.designpattern.structural_patterns.proxy.example;

public class Client {

	public static void main(String[] args) {
		Image image = new ProxyImage("test.png");
		// 이미지가 처음 호출될 때 실제 이미지를 로드하고 표시
		image.display();
		// 이미지가 이미 로드되었기 때문에(캐싱) 다시 로드하지 않고 표시만
		image.display();
	}
}
