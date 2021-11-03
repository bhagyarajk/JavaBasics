package com.keepitsimple.programs;

public class SwapStringsWithoutTemp {
	public static void main(String[] args) {
		System.out.println("Main method started ...");
		String str1 = "Hello";
		String str2 = "World";

		// Concatenate both so HelloWorld
		str1 = str1 + str2;
		System.out.println(str1);
		// Removed World so
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str2);
		// Remove the Hello
		str1 = str1.substring(str2.length());
		System.out.println(str1);

	}
}
