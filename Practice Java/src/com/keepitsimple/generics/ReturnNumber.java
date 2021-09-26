package com.keepitsimple.generics;

public class ReturnNumber<T1 extends Number, T2 extends Number> {
	T1 number;
	T2 pointNumber;
	String name;

	ReturnNumber(T1 number, T2 pointerNumber, String name) {
		this.number = number;
		this.pointNumber = pointerNumber;
		this.name = name;

	}

	public T1 getNumber() {
		return this.number;
	}

	public void setNumber(T1 number) {
		this.number = number;

	}

	public T2 getPointNumber() {
		return this.pointNumber;
	}

	public String getName() {

		return this.name;
	}

	public int getSquare(T1 number) {
		// these below lines of code will throw the error if we did not add the extends
		// keyword in the type parameter
		// As we added the extends keyword it means we can Number or it's child classes
		// as the type parameter, so in this case
		// we passed Integer, but on the Integer also we can't perform the arithmatic
		// operations ie. the reason we converted from Integer to int type and then
		// squared a number
		int integerNumber = number.intValue();
		return integerNumber * integerNumber;
	}

	//
//	public int getSquare(T1 number) {
//		// below line will give CTE, because T1 can be anytype but arithmetic operations
//		// are allowed only on numbers to solve this we need to use the extends keyword
//		// with the type ref
//		return (number * number);
//
//	}

}
