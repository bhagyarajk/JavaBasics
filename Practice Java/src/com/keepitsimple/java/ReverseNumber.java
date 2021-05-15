package com.keepitsimple.java;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	System.out.println("enter the number ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int rev = 0;
	int temp = 0;
	while (num > 0) {
		temp = num % 10;
		rev = rev * 10 + temp;
		num = num / 10;
	}
	System.out.println("the reversed number is : " + rev);
}
}
