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
		
		// usage of parseInt
		String s = "111";
		// The second parameter will take radix, it means the second parameter is used to specify the base system of the number that you passed in first param
		// Means, the string you are passing is of base 2 or binary number, and should be converted into decimal, this will give the output 7
		int a = Integer.parseInt(s,2);
		System.out.println(a);
		}
	// There is a static method toString() in wrapper classes don't confuse with the toString() method of object class which is non static, we are not overriding 
	// the signature of static toString() method is different 



}
