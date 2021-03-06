package com.keepitsimple.cloning;

public class ShallowCloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Demo1 demo1var1 = new Demo1();
		demo1var1.a = 10;
		demo1var1.b = 20;
		demo1var1.demo2.x = 100;
		demo1var1.demo2.y = 200;
		// step 3 : call the clone method and typecast it
		Demo1 demo1var2 = (Demo1) demo1var1.clone();
		demo1var2.a = 100;
		demo1var2.b = 200;
		demo1var2.demo2.x = 1000;
		demo1var2.demo2.y = 2000;

		System.out.println(demo1var1 == demo1var2);
		/*
		 * These below lines of code will tell you that the cloning performed is the
		 * shallow cloning output : false 10 20 1000 2000
		 */

		// Cloning means you should actually copy all the properties of one object and
		// create another object with the same properties and same value
		// and both should be independent objects, but incase of the shallow cloning it
		// copies the primitive type but for non-primitive type members like demo2 in
		// in our case, the address of that is just copied, copying the address will
		// make
		// to point to the same object

		System.out.println(demo1var1.a);
		System.out.println(demo1var1.b);
		System.out.println(demo1var1.demo2.x);
		System.out.println(demo1var1.demo2.y);

	}

}

// step 1 : In order to make the Demo1 class clonable, implement the clonable interface first 
class Demo1 implements Cloneable {
	int a;
	int b;
	Demo2 demo2 = new Demo2();

	// step 2 : Override the clone method of the object class because the clone
	// method of the object class is protected to to call the clone method of the
	// object class we override it
	// within this method return the super.clone() and it's called the
	// shallow cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}

class Demo2 {
	int x;
	int y;

}
