package com.keepitsimple.multithreading.threadmethods.yield;

public class YieldDemo {
	public static void main(String[] args) {
		System.out.println("Inside main method ...");
		MyThread mt = new MyThread();
		mt.start();

		for (int i = 0; i < 30; i++) {
			System.out.println("Inside main-thread");
		}
	}

}
