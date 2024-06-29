package com.tistory.jaimemin.designpattern.structural_patterns.decorator.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class DecoratorInJava {

	public static void main(String[] args) {
		// Collections가 제공하는 데코레이터 메소드
		ArrayList list = new ArrayList<>();
		list.add(new Book());

		List books = Collections.checkedList(list, Book.class);

		// 타입 체킹하기 때문에 에러 발생
		//        books.add(new Item());

		List unmodifiableList = Collections.unmodifiableList(list);
		list.add(new Item());
		unmodifiableList.add(new Book());

		// 서블릿 요청 또는 응답 랩퍼
		HttpServletRequestWrapper requestWrapper;
		HttpServletResponseWrapper responseWrapper;
	}

	private static class Book {

	}

	private static class Item {

	}
}
