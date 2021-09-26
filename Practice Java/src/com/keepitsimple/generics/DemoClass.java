package com.keepitsimple.generics;

import java.util.ArrayList;

public class DemoClass {

	// Non generic area -->
	// When an object is sent from generic to non-generic area it behaves like the
	// non-generic object
	// Below m1 method is making arraylist type unsafe, in other words you are not
	// passing any type parameters
	// As you are not passing any type parameters, it will be replace by object in
	// the entire implementation of the arraylist, this make methods to return
	// Object and methods to accepts Object in simple words making it type unsafe
	public void m1(ArrayList arrayList) {

		System.out.println(arrayList);
		// Below lines of code demonstrate how the generic object in non-generic area
		// behaves as non-generic
		arrayList.get(0);
		arrayList.add("String");

	}

	// Generic area ---> when an object is transfered from non-generic code to
	// generic code it behaves as generic,

	public void m2(ArrayList<Integer> arrayList) {
		arrayList.add(10);
		// From the below lines of code you can see that how a non-generic object in
		// generic area behaves like generic object
		// below line of code will give CTE
		// arrayList.add("String");

	}

	public void test(ArrayList<? super Integer> list) {
		list.add(10);
		System.out.println(list);
	}

}
