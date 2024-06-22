package com.tistory.jaimemin.designpattern.structural_patterns.adapter.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

	public static void main(String[] args) {
		// collections
		List<String> strings = Arrays.asList("a", "b", "c"); // 전달해준 것은 가변인자인 배열이지만 List로 변환해줌
		Enumeration<String> enumeration = Collections.enumeration(strings); // List를 넘겨줬지만 Enumeration으로 반환 받음
		ArrayList<String> list = Collections.list(enumeration); // Enumeration을 받아서 List로 변환

		// io
		// 일종의 어댑터 패턴
		try (InputStream is = new FileInputStream("input.txt"); // String을 줬지만 원하는 Target Interface인 InputStream을 반환받음
			 InputStreamReader isr = new InputStreamReader(is); // InputStream을 넘겨줬지만 InputStreamReader를 반환받음
			 BufferedReader reader = new BufferedReader(isr)) {
			while (reader.ready()) {
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
