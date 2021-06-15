package com.keepitsimple.programs;

public class NullCheck {
public static void main(String[] args) {
	System.out.println("Main method started");
	Integer a = null;
	Integer b = null;
	// below will evaluate to true
	if(a == b) {
		System.out.println("both the nulls are equal in java, they are actually equal in js also even with the strict equal operator, they are not equal in sql");
	}
}
}
