package com.keepitsimple.programs;

import java.util.Scanner;

public class HCFOfTwoNumbers {
	public static void main(String[] args) {
		System.out.println("main method started ...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		int hcf = 0;

		// For loop should go till, the largest number among the two
		// when there is a common multiple found we need to assign the hcf var to i,

		for (int i = 1; i <= number1 || i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF of the two numbers are : " + hcf);

	}
}
