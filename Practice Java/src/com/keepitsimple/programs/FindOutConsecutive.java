package com.keepitsimple.programs;

import java.util.Arrays;

public class FindOutConsecutive {
	public static void main(String[] args) {
		int max;
		int min;
		int numberOfElements;
		int[] arr = { 1, 2, 4 };
		Arrays.sort(arr);
		max = arr[arr.length - 1];
		min = arr[0];
		numberOfElements = arr.length;
		if (max + min - 1 == numberOfElements)
			System.out.println("They are consecutive ...");
		else
			System.out.println("Not consecutive");

	}
}
