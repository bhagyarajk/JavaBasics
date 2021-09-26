package com.keepitsimple.multithreading.threadmethods.join;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("Inside MyThread ....");
		}
	}
}
