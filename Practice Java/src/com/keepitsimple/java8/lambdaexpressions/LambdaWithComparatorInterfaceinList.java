package com.keepitsimple.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaWithComparatorInterfaceinList {
	public static void main(String[] args) {
		System.out.println("Main method started");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(0);
		arrayList.add(-10);
		arrayList.add(50);

		// output : insertion order preserved : [10, 20, 0, -10, 50]
		System.out.println(arrayList);
		// sort method will sort the list in the default natural sorting order if you
		// did not pass the object ref of the comparator, for
		// integer it's ascending for string it's alphabetical
		Collections.sort(arrayList);
		// output : [-10, 0, 10, 20, 50]
		System.out.println(arrayList);

		// what if we want to sort the same list in the descending order : then we need
		// to implement the compare() of the Comparator interface, but we will use
		// lambda expressions here
		Comparator<Integer> comparator = (element1, element2) -> (element1 > element2) ? -1
				: (element1 < element2) ? 1 : 0;
		// you can even directly pass the lambda expression

		Collections.sort(arrayList, comparator);
		System.out.println("List in the descending order : " + arrayList);

	}
}
