package com.keepitsimple.abstraction;

public abstract class AbstractClassDemo {

	public static void main(String[] args) {
		System.out.println("Main method started ..");
		// below line will give the error
		// Test test = new Test();

		ChildOfTest cTest = new ChildOfTest();
		cTest.display();

	}
}

abstract class Test {
	int a;
	static int b;

	Test() {
		System.out.println(
				" Inside the abstract class constructor Just declaring the constructor it will not give any error ! and will be executed when the child class instantiated");
		this.a = 10;
	}

	/*
	 * 1. Methods without the body are called abstract methods 2. If a class
	 * contains at least one abstract method then that class must be declared as the
	 * abstract class 3. We can't instantiate the abstract class 4. If a method is
	 * abstract then it's not a static or non-static the modifier it self is
	 * abstract 5. We must provide the implementations for all the abs methods in
	 * the subclass, if you miss anyone of them you must declare that subclass also
	 * as the abstract class 6. If you declare the class as abstract then you cant
	 * instantiate it, even if the the class contains no abstract methods you can
	 * declare the class as abstract
	 */
	public abstract void display();

	public static void hello() {

	}
}

class ChildOfTest extends Test {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				"Display method of the abstract class been overidden here in the child class --> that means we have implemented this abstract method ");

	}

}