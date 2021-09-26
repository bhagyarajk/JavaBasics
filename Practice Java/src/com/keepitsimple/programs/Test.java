package com.keepitsimple.programs;

import java.util.ArrayList;
import java.util.List;

public class Test implements TestInterface {

	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		return false;
	}

	public void add(int a) {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		System.out.println("Inside the main method ...");
		List c = new ArrayList();
		c.add(0, c);

	}

}
