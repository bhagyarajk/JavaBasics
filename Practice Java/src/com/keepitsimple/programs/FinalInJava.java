package com.keepitsimple.programs;

// All the local variables in java can't be used without initialization

// If you declare a local variable and does not initialize, then they will not throw any error until they are used somewhere, if they are used somewhere without the initialization then it will throw error
// Non final Static and non-static variables can be used without the initialization - if we use without the declaration they will contain --> default values like null, 0 etc..

// Final keyword behaves differently with respect to different types of variables
// 1. For local final variables --> you can't reassign once you initialize
// 2. For static and non-static variables --> You have to initialize the final variables either in blocks or constructors, to avoid the compile time error
// 3. If you simply declare a final static or non-static variable, they are called blank final variable,blank final variables will not throw compile time error until they are initialized in constructor or blocks

public class FinalInJava {
	// these below two lines of code will throw error if you did not initialize ->
	// non local final variables are called blank final variables
	// non local final variables will throw CTE until they have been initialized
	// these x and y in constructor or block
	// As x is static I will use static block and y is non-static I will use
	// constructor
	final static int x;
	final int y;

	FinalInJava() {
		y = 10;
	}

	static {
		x = 11;
	}

	public static void main(String[] args) {
		final int local;
		local = 10;
		// Note 1 : below line of code will not compile : because final local variables
		// cant be re-assigned
		// local = 11;
	}
}

// conclusion : Local final variables if not initialized will not throw any error until you are trying to use them
// Blank final variables will throw the errors if not initialized whether you are trying to use them are not
