package com.keepitsimple.generics;

public class Student<T1, T2> {
	private T1 name;
	private T2 rollNo;

	public T1 getName() {
		return name;
	}

	public void setName(T1 name) {
		this.name = name;
	}

	public T2 getRollNo() {
		return rollNo;
	}

	public void setRollNo(T2 rollNo) {
		this.rollNo = rollNo;
	}

}
