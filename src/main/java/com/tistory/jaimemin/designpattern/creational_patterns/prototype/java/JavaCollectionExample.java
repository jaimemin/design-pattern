package com.tistory.jaimemin.designpattern.creational_patterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

	public static void main(String[] args) {
		Student jaimemin = new Student("jaimemin");
		Student gudetama = new Student("gudetama");
		// ArrayList<Student> students = new ArrayList<>();
		// ArrayList<Student> clonedStudents = (ArrayList<Student>)students.clone();
		List<Student> students = new ArrayList<>();
		students.add(jaimemin);
		students.add(gudetama);

		/**
		 * List는 Cloneable을 상속하지 않기 때문에 clone()을 지원하지 않고
		 * ArrayList는 Cloneable을 상속함
		 * 생성자에 파라미터로 컬렉션을 넘겨주면 프로토타입 패턴 효과를 얻을 수 있음
		 * 엄밀히 말하면 프로토타입 패턴은 아니지만 비슷한 효과
		 */
		List<Student> clone = new ArrayList<>(students);
		System.out.println(clone);
	}
}
