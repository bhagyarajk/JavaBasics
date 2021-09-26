package com.keepitsimple.programs;

import java.util.ArrayList;
import java.util.Collections;

public class LongestSub {
	public static void main(String[] args) {
		System.out.println("inside main .. ");
		LongestSub ls = new LongestSub();
		int test = ls.longSub("bbaaacd");
		System.out.println("longest would be : ");

	}

	public int longSub(String str) {
		// conv string into char array

		char[] character = str.toCharArray();
		ArrayList<Integer> countValue = new ArrayList<Integer>();

		// One pointer for pointing out each char
		for (int i = 0; i < character.length; i++) {
			// iterator
			int count = 0;
			for (int j = i + 1; j < character.length; j++) {

				if (character[j] != character[i]) {
					count++;
				} else

					break;
			}
			countValue.add(count);

		}
		Collections.sort(countValue);

		return countValue.get(countValue.size() - 1);

	}

}
