package com.keepitsimple.multithreading.threadmethods.join;

public class JoinDemo {
	public static void main(String[] args) {
		System.out.println("Inside main method ...");
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 30; i++) {
			System.out.println("Inside main thread ...");
		}
	}
}
