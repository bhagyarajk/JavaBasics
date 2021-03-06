package com.keepitsimple.interfaces.tightcoupling;

public class UtilityClass {
	public static void main(String[] args) {
		System.out.println("Main method started ..");

		// Using the class reference tight coupling ..
		ImplementationClass ic = new ImplementationClass();
		ic.getUserName();
		ic.display();
		ic.demo();
		// Using the interface type reference --> Loose coupling
		Interface1 interfaceRef = new ImplementationClass();
		// Now using this, you will not be able to access the class specific methods
		interfaceRef.display();
		interfaceRef.getUserName();

		// This loose coupling is helpfull

	}
}
