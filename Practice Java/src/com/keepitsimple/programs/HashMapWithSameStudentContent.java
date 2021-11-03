package com.keepitsimple.programs;

import java.util.HashMap;

public class HashMapWithSameStudentContent {
	public static void main(String[] args) {
		Student s1 = new Student("hello", 2);
		Student s2 = new Student("hello", 2);
		HashMap map = new HashMap();
		map.put(s1, 2);
		map.put(s2, 2);

	}

}
