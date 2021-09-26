package com.keepitsimple.multithreading.threadmethods.yield;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Inside My-thread");
			// My-thread is calling yield method so it pauses it's execution and enters into
			// runnable state again
			Thread.yield();
		}
	}
}
