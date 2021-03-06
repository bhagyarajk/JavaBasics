package com.keepitsimple.java;

public class ThisAndSuperKeyword extends SuperClass {
	int a;
	int b;

	{
		System.out.println("this is the non-static block..");
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public ThisAndSuperKeyword(int a, int b, int a2, int b2) {
		super(a, b);
		this.a = a2;
		this.b = b2;
	}

	public void getValuesOfSuperclass() {
		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		System.out.println("Main method started ...");
		ThisAndSuperKeyword ts = new ThisAndSuperKeyword(10, 20, 30, 40);
		SuperClass SuperClass = new SuperClass(20, 30);
		System.out.println("The value of a : " + ts.a);
		System.out.println("The value of b : " + ts.b);

		ts.getValuesOfSuperclass();

	}
}

class SuperClass {

	int a;
	int b;

	public SuperClass(int a, int b) {
		super();
		/*
		 * 1. this keyword always holds the address of the currently executing object or
		 * the object on which the current method is been invoked when we have both the
		 * non-static and the local variables with the same name inorder to distinguish
		 * them we will use this keyword 2. super keyword always holds the address of
		 * the super class object, so both of these keywords can only be used with the
		 * non-static refference cant be used with static refference (becoz when ever
		 * there is a classloading the non-static values not yet exits on the memory...)
		 */
		this.a = a;
		this.b = b;
	}

	public void display() {

		System.out.println("executing display method of the non-static method ");
		System.out.println(this.a);
	}

	public static void demo() {
		System.out.println("executing demo method of the static method ..");
		// this can only be used inside the constructor or the non-static method
		// System.out.println(this.a);
	}

}
