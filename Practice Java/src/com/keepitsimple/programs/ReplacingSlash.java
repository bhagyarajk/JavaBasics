package com.keepitsimple.programs;

public class ReplacingSlash {

	public static void main(String[] args) {
		String str = "he//l///llo";
		// String str = "//a//b//c";
		char[] charArray = str.toCharArray();
		for (char d : charArray) {
			System.out.println(d);
		}

		int index = 0;
		char[] formattedArray = new char[charArray.length];
		for (int i = 0; i < charArray.length;) {

			if (charArray[i] == '/') {
				int count = 0;
				while (charArray[i] == '/') {

					if (count == 0) {
						formattedArray[index] = '/';
						++index;
						++count;
						++i;
					} else {
						++i;
					}
				}

			}

			else {
				formattedArray[index] = charArray[i];
				++index;
				++i;

			}

		}

		for (char c : formattedArray) {
			System.out.println(c);
		}

		String formattedString = new String(formattedArray);
		System.out.println("Formated string after the removal of extra slashes is :  " + formattedString);
	}
}
