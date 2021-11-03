package com.keepitsimple.programs;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		System.out.println("Inside main method ...");
		int a = 10;
		int b = 15;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
