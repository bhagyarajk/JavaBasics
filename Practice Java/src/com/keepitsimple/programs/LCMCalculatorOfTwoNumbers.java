package com.keepitsimple.programs;

import java.util.Scanner;

public class LCMCalculatorOfTwoNumbers {
	public static void main(String[] args) {

		// Algorithm is : simply the lcm of the two numbers will generally be
		// Greater than the second number, so initially lets assign lcm to be the
		// biggest number
		// and till we find out the lowest common multiple we will keep on increasing
		// the value of the var lcm
		System.out.println("Main method started ...");
		System.out.println("Enter the first number");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		System.out.println("enter the second number");
		int number2 = input.nextInt();

		int lcm = (number1 > number2) ? number1 : number2;
		while (true) {
			if (lcm % number1 == 0 && lcm % number2 == 0) {
				System.out.println("LCM of the two numbers is : " + lcm);
				break;
			}
			lcm++;
		}

	}
}
