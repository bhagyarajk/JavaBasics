package com.keepitsimple.multithreading;

public class ThreadNoArgConstructor {
	public static void main(String[] args) {
		System.out.println(" Inside the main method ... ");
		Thread t = new Thread();
		t.start();
		System.out.println("Main method ended");
	}
}
