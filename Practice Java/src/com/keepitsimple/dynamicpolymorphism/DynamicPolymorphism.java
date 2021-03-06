package com.keepitsimple.dynamicpolymorphism;

// The code should contain Loose coupling, Generalization and overriding together
public class DynamicPolymorphism extends Test {
	@Override
	public void display() {
		
		System.out.println("Display method of the child class");
	}

	public static void main(String[] args) {
		// compiler will have no idea on which class object is going to be created
		// during the run time that's the reason this is called the dynamic polymorphism
		Test test = new DynamicPolymorphism();
		test.display();

	}
}

class Test {
	public void display() {
		System.out.println("Display method of the parent class");
	}
}
