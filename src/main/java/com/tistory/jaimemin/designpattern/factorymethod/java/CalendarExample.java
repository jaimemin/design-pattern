package com.tistory.jaimemin.designpattern.factorymethod.java;

import java.util.Calendar;
import java.util.Locale;

/**
 * 단순한 팩토리 패턴
 *
 * 매개변수의 값에 따라 혹은 메서드에 따라 각기 다른 인스턴스를 반호나하는 단순한 버전의 팩토리 패턴
 */
public class CalendarExample {

	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().getClass());
		System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
		System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
	}
}
