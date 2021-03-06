package com.keepitsimple.java;

public class Patterns {
public static void main(String[] args) {
	System.out.println("Here we learn about the patterns");
	
/*	// Pattern No.1
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
	}
*/	
	// Pattern No. 2
	for (int i = 5; i > 0; i--) {
		for (int j = 5; j >= i ; j--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
/*	Important point to remember : Variables declared inside the loops are not accessible outside the loops
	And Below are some cases where it may see confusing of using the for loops 
*/	
	// This will not give the error 
	for (int i = 0; i < 5; i++); {
		System.out.println("Hello ...");
	}
	
	// 
	int i = 0;
	for (; i < args.length; i++) {
		System.out.println("Working without errors but we cant use i again ..");
	}
	
	for (; i < 10;  ) {
		System.out.println("This looks strange");
		i++;
	}
	
	// Even this will also not give any compile time error.. to just break the infinite loop I have used the break statement 
	for (; ;) {
		System.out.println("Even this will not give any error ");
		break;
		
	}
	
}
}
