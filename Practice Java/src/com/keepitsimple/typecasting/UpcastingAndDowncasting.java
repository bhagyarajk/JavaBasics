package com.keepitsimple.typecasting;

public class UpcastingAndDowncasting extends SuperClassOfUpcastingAndDownCasting {
	public static void main(String[] args) {
		System.out.println("main method started");

		// Upcasting : implicit
		SuperClassOfUpcastingAndDownCasting superClass = new UpcastingAndDowncasting();
		// there are two types for upcasting and down casting : upcasting is converting
		// subclass object to super class object
		// Downcasting : converting the super class object to subclass type
		// Directly downcasting can't be performed you can only perform downcasting on
		// the upcasted object
		// Downcasting should be done explicitly where as upcasting done implicitly

		// Downcasting : on the upcasted object
		UpcastingAndDowncasting subclass = (UpcastingAndDowncasting) superClass;

		// It will throw class caste expection is the casting is not been done properly

	}
}

class SuperClassOfUpcastingAndDownCasting {

}