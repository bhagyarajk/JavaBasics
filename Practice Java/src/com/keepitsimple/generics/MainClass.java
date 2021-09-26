package com.keepitsimple.generics;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method started");
		ReturnNumber<Integer, Double> number = new ReturnNumber<Integer, Double>(10, 10.22, "Testing");
		System.out.println(number.getNumber());
		System.out.println(number.getPointNumber());
		System.out.println(number.getName());

		// Generic and Non-generic Area

		// Generic code
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);

		DemoClass demo = new DemoClass();
		demo.m1(arrayList);
		System.out.println(arrayList);
		demo.m2(arrayList);

		// Non-generic code
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(10);
		arrayList2.add("Java");
		arrayList2.add(1.2f);

		// Method 1 : Demonstrating that the generics concept only exists at the compile
		// time
		ArrayList al = new ArrayList<String>();
		al.add(10);
		al.add("Second Java");
		al.add(Integer.valueOf(10));

		// In the output you can see that there is an Integer objects also, so it means
		// this generics concept only exists at the compile time, if there is a generics
		// concept at the runtime jvm should not have allowed any objects other than
		// string, but that's not the case practically
		System.out.println("The elements of array list are : " + al);

		// Below lines of code demonstrate how the non-generic code internally works

		// Not passing the type parameter, now how the compiler analyzes the code I have
		// given in notes pls checkout that
		ReturnNumber number2 = new ReturnNumber(100, 20.2, "One more");
		System.out.println(number2.getName());
		System.out.println(number2.getPointNumber());
		System.out.println(number2.getNumber());

		// Below line of code will throw error, because the first parameter T1 extends
		// Number it means, compiler replaces all the T1 with
		// Number, so Constructor can accept all the Number and it's child classes but
		// not the String class
		// ReturnNumber number2 = new ReturnNumber("Bhagyaraj", 20.2, "One more");

		demo.test(arrayList);
		ReturnNumber test = new ReturnNumber<Integer, Integer>(10, 20, "hello");

		// Here you can set the value to the student because the wild card has the super
		// and only integer can be added
		Student<? super Integer, ? super Integer> student = new Student();
		Integer value = 10;
		student.setName(value); // setName here will actually has the parameter of type Object I mean which
								// actually accepts object but still you can only add Integer type
		// you have used the extends with the wildcard you can only add null other than
		// that no other type is allowed so
		// below setmethod will throw cte

//		Student<? extends Integer, ? extends Integer> student2 = new Student();
//		Integer value2 = 10; 
//		student2.setName(value2); // setName will actually accepts the parameters of the type Integer, but still you can't add Integers

		// T replaced by Object but, does not behaves as expected
		ReturnNumber<? extends Object, ? extends Object> test2 = new ReturnNumber(11, 20, "hello");

	}

}
