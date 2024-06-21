package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.example;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.FactoryBean;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PersonFactoryBean implements FactoryBean<Person> {

	private String xmlFilePath;

	public void setXmlFilePath(String xmlFilePath) {
		this.xmlFilePath = xmlFilePath;
	}

	@Override
	public Person getObject() throws Exception {
		File xmlFile = new File(xmlFilePath);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(xmlFile);

		Element root = document.getDocumentElement();
		String name = root.getElementsByTagName("name").item(0).getTextContent();
		int age = Integer.parseInt(root.getElementsByTagName("age").item(0).getTextContent());

		Person person = new Person();
		person.setName(name);
		person.setAge(age);

		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
