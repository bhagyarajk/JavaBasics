package com.keepitsimple.objectclass;

public class ObjectClass {
	public static void main(String[] args) {
		System.out.println("Main method started..");
		ObjectClass object = new ObjectClass();
		System.out.println(object.toString());
		System.out.println(object.hashCode());
		System.out.println(object.equals(new String()));
		System.out.println("------------------------------");
		// Fully qualified name of the class
		System.out.println(object.getClass().getName());

		MobileClass mobile = new MobileClass();
		System.out.println(mobile);

	}
}
