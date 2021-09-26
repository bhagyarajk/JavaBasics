package com.keepitsimple.multithreading.threadmethods.interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		System.out.println("Inside main method ...");
		MyThread mt = new MyThread();
		mt.start();
		mt.interrupt();
		for (int i = 0; i < 30; i++) {
			System.out.println("Main thread ...");
		}
	}
}
