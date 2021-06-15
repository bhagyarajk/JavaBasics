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
		
		// Note : to type cast we need to acheive a kind of equilibrium state by this what I mean is 
		// lets say you are trying to convert a string object to and Object class object, in that case 
		// you can happily do that because the object under action (Object which we are converting --> string class object), already has the 
		// properties of Object class, then it should not be a problem during the conversion
		// But when you are converting from Object to string, it's not possible because Object under action --> object class object
		// does not contain the properties of string class so this type of conversion is not possible
	
		// But bear in mind you can happily convert the upcasted object of string class to string class like 
		// Object obj = new String();
		// String str = (String) obj;

	}
}

class SuperClassOfUpcastingAndDownCasting {

}