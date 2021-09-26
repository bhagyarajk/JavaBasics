package com.keepitsimple.programs;

import java.util.Arrays;

public class CheckAnagrams {
	public static void main(String[] args) {
		String str1 = "triangle";
		String str2 = "integral";

		CheckAnagrams ca = new CheckAnagrams();
		System.out.println("two string are : " + ca.checkAnagrams(str1, str2));

	}

	public boolean checkAnagrams(String str1, String str2) {

		if (str1.length() == str2.length()) {
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			// sort the strings
			Arrays.sort(char1);
			Arrays.sort(char2);

			// compare the strings
			for (int i = 0; i < char1.length; i++) {
				if (char1[i] == char2[i])
					return true;
				else
					return false;
			}
		}
		return false;
	}

}
