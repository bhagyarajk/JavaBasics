package com.keepitsimple.java;

public class BlocksAndConstructors {
	int a;
	static int b;

	// Constructors
	public BlocksAndConstructors(int a) {
		this.a = a;
	}
	// Let me define the static block

	static {
		System.out.println("executing the static block...");
	}
//Let me define the non-static block 
	{
		System.out.println("executing the non-static block ...");
	}

	public static void main(String[] args) {

		System.out.println("main method started ...");
		BlocksAndConstructors bs = new BlocksAndConstructors(10);
		System.out.println(BlocksAndConstructors.b);
		Check check = new Check();
		System.out.println(Check.a);

	}
}

class Check {
	static int a;
	static {
		System.out.println("static block of the check class");
	}
}
