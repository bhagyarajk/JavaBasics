package com.keepitsimple.java;

public class ShiftingOperator {
public static void main(String[] args) {
	System.out.println("Hello Java from the eclipse ...");
	int a = 10;
	int b = -10;
	System.out.println("The binary format for the number is : " + Integer.toBinaryString(a));
	System.out.println("The binary format for the negetive value is : " + Integer.toBinaryString(b));
	
	// we will learn about the right shift and the left shift operator 
	
	// For positive numbers
	// >> --> this is arithmetic right shift or signed right shift
	// >>> --> this is logical right shift or unsigned right shift
	int c = a >> 2;
	System.out.println("the value of the a after right shifting by two digits in binary format is  : " + c + " --> "+Integer.toBinaryString(c));
	int d = a << 2;
	System.out.println("the value of the a after left shifting by two digits in binary format is  : " + d + " --> "+ Integer.toBinaryString(d));
	
	// For Negative numbers
	
	int e = b >> 2;
	System.out.println("the value of the b after the right shifting by two digits in binary format : " + e + " --> "+ Integer.toBinaryString(e));
	int f = b << 2;
	System.out.println("the value of the b after left shifting by two digits in binary format : " + f + "--> " + Integer.toBinaryString(f));
}
}
