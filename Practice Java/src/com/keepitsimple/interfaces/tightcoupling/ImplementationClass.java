package com.keepitsimple.interfaces.tightcoupling;

public class ImplementationClass implements Interface1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is the display method from the interface");
	}

	@Override
	public void getUserName() {
		// TODO Auto-generated method stub
		System.out.println("this is the getUserName() interface methods ..");

	}

	// this is the class specific method
	public void demo() {
		System.out.println("this is the class specific demo method");
	}

}
