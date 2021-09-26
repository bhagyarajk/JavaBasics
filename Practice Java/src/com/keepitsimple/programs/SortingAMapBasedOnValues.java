package com.keepitsimple.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class SortingAMapBasedOnValues {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "Ball");
		map.put(3, "Apple");
		map.put(2, "Dog");
		map.put(4, "Cat");
		map.put(6, "Elephant");
		map.put(5, "Food");

		LinkedList<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(list, (element1, element2) -> element1.getValue().compareTo(element2.getValue()));

		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		list.forEach((listElement) -> {
			sortedMap.put(listElement.getKey(), listElement.getValue());
		});
		System.out.println(sortedMap);

	}
}
