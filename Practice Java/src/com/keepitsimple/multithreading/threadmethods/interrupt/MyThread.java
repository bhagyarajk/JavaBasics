package com.keepitsimple.multithreading.threadmethods.interrupt;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {

			System.out.println("From MyThread ...");
		}

		try {
			// when you call sleep method the thred will go to waiting state as soon as
			// MyThread goes to waiting state
			// we will get InterruptedException as there is an interrupt call on MyThread
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
