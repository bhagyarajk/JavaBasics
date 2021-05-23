package com.keepitsimple.cloning;

public class DeepCloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Inside the main method ...");
		Test1 test = new Test1();
		test.a = 10;
		test.b = 20;
		test.demo.x = 100;
		test.demo.y = 200;

		Test1 test2 = (Test1) test.clone();
		test2.a = 100;
		test2.b = 200;
		test2.demo.x = 1000;
		test2.demo.y = 2000;

		// This is deep cleaning here the individual reference type member, will point
		// to an independent object so it solves the prob of shallow cloning

		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.demo.x);
		System.out.println(test.demo.y);

	}

}

class Test1 implements Cloneable {
	int a;
	int b;
	Test2 demo = new Test2();

	@Override
	public Object clone() throws CloneNotSupportedException {
		Test1 t1 = (Test1) super.clone();

		// this line is to point to a new independent object
		t1.demo = new Test2();
		// copying the values here
		t1.demo.x = demo.x;
		t1.demo.y = demo.y;
		return t1;
	}

}

class Test2 {
	int x;
	int y;
}
