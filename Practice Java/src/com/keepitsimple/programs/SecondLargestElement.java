package com.keepitsimple.programs;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		System.out.println("main method started..");

		;

		// Method 1 : by using Arrays utility class
		int[] a = { 1, 2, 3, 8, 4, 10, 2 };
		Arrays.sort(a);
		System.out.println(a[a.length - 2]);

		// Method 2 : By using Integer Array

		Integer[] b = new Integer[] { 1, 2, 4, 3 };
		// Arrays.sort(b, Collections.reverseOrder());
		// Above line is as same as this one
		Arrays.sort(b, (element1, element2) -> (element1 > element2) ? -1 : (element1 < element2) ? 1 : 0);
		System.out.println(b[1]);

	}

}
