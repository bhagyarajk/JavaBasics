package com.keepitsimple.java;

public class ConstrutctorcallingAndChaining extends Test {

	public ConstrutctorcallingAndChaining(int a, double b, float c, java.lang.String string) {
		// Constructor chaining this must be the first statement
		super(a, b, c, string);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}
}

class Test {
	int a;
	double b;
	float c;
	String String;

	public Test(int a, double b, float c, java.lang.String string) {
		// Constructor calling this must be the first statement
		this(10);
		this.a = a;
		this.b = b;
		this.c = c;
		this.String = string;
	}

	public Test(int i) {
		this(20.2);
		System.out.println("inside the single int parameter constructor");
	}

	public Test(double d) {
		System.out.println("inside the single parameterized double constructor");
	}

}
