package com.keepitsimple.hasarelation.compositiondemo;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method started");
		Person person = new Person("Raj");
		System.out.println("Name of the person is : " + person.name + " and role is : " + person.job.getRole());
		person = null;
		// Now you have no way to access the job of the person Raj --> it means if Raj
		// class Object destroyed, automatically Job class object associated with Raj
		// class destroyed
		// So in simple words : if the container object is destroyed, the associated
		// contained
		// object also got destroyed, this scenario is composition.
	}
}
