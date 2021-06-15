
package com.keepitsimple.programs;

import java.util.function.Predicate;

public class PrintingWithoutSemicolon {
public static void main(String[] args) {
	


	// I will tell the two easiest methods
	// Method 1 : by using the printf method inside the if 
	System.out.println("Inside the main method");
	if(System.out.printf("Hello World !!") != null) {
		
	}
	
	// Method 2 : using the for loop
	for (int i = 0; i < 1; System.out.println("Hello world!!")) {
		i++;
	}

}
}
