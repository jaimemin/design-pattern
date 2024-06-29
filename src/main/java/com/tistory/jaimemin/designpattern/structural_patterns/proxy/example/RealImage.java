package com.tistory.jaimemin.designpattern.structural_patterns.proxy.example;

class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;

		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println(fileName + " 로딩 중");
	}

	@Override
	public void display() {
		System.out.println(fileName + " 출력");
	}
}
