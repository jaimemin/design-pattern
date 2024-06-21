package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.java;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DocumentBuilderFactoryExample {

	/**
	 * xml 형태의 문서를 자바 클래스로 변환하는 DocumentBuilderFactory
	 */
	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder(); // 추상적인 타입인 DocumentBuilder 기반으로 구현하게 됨으로 추상 팩토리 패턴이라 할 수 있음
		Document document = builder.parse(new File("src/main/resources/config.xml"));
		System.out.println(document.getDocumentElement());
	}
}
