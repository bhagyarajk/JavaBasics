package com.keepitsimple.java;

public class ManyClassesInoneFile {
	public static void main(String[] args) {
		System.out.println("here we will learn something new ...");

		/*
		 * 1. Single source file can contain any number of classes but only one public
		 * class is allowed this restriction is to reduce the compile time to increase
		 * the performance, for public classes during compilation java has to ensure
		 * that all the properties of the class should be accessible anywhere in the
		 * project to make is possible it a resource intesive process, that is the
		 * reason there is a restriction put so that only one public class is allowed 2.
		 * If there is a public class in the source file make sure the source file name
		 * should be given with the same classname and incase there is a requirement for
		 * main method make sure you have the main method in the same public class
		 * 
		 * so Keeping it simple : In order to make the compilation process quickly we
		 * have this rule
		 * 
		 */

	}

}

//this class cant be the public class and this classname should not be given to the source file 
class SecondClassInTheSameFile {
	int x;
	int y;
}