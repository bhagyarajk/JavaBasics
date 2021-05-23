package com.keepitsimple.wrapperclass;

public class WrapperClassesDemo {
	public static void main(String[] args) {

		System.out.println("Inside the main method of the wrapper class");

//		Wrapper classes are final, implements comparable and all the three methods of the object class have been overridden 
		// Autoboxing
		Integer var1 = 100;
		// Manual Autoboxing
		// Static method
		Integer var2 = Integer.valueOf(200);

		// Auto Unboxing
		int var3 = var1;
		// Manual unboxing
		// Nonstatic method
		int var4 = var2.intValue();

	}

}
