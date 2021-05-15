package com.keepitsimple.java;

public class StaticAndNonStatic {

	static int a;
	int b;
	SecondClass second;

	public static void main(String[] args) {
		System.out.println("Within the main method ...");

		/*
		 * Let me explain about the modifiers 1. Access 2. Non-access Modifiers 1. 1.
		 * Private -> Only within the same class 2. default -> only within the package
		 * 3. Protected -> within the package and outside the package but outside the
		 * pacakge is-A is needed 4. Public -> Anywhere Note : but remember if the class
		 * is default and your member is public then you cant access that member outside
		 * the package 2. Non-access -> Static, Synchronized, Transient, Abstract,
		 * Volatile, Final, Native etc.. Note : All of these are key words and should be
		 * used with the lowercase just for the explaination I have written in a proper
		 * english way
		 */

		/*
		 * Static : Any thing which belongs to an entire class Non-static : which is
		 * specific to the specific object Both static and Nonstatic variables always
		 * contain the default values if they are not assigned with any ex. for String
		 * null, for integer 0 etc..
		 */

		System.out.println("the value of a is : " + StaticAndNonStatic.a);
		// To access the non static variables we need to create an object of the class
		StaticAndNonStatic sns = new StaticAndNonStatic();
		System.out.println("the value of b is : " + sns.b);
		// Even this will contain the null value
		System.out.println("the value for the refference type member secondclass is : " + sns.second);
		SecondClass second = new SecondClass();

		second.display();
		// below line will give the can't make the static refference to non-static field
		// b
		//
		// System.out.println(b);

	}

}

class SecondClass {
	int x;
	int y;

	void display() {
		System.out.println("Display method of SecondClass is been called ...");
		// below line would have given the error if the second class is the inner static
		// nested inner class
		System.out.println(y);
	}
}
