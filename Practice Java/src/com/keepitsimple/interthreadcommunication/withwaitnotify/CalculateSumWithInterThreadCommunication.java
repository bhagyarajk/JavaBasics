package com.keepitsimple.interthreadcommunication.withwaitnotify;

public class CalculateSumWithInterThreadCommunication extends Thread {

	int total;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "  : is the running thread Name ");

		synchronized (this) {
			System.out.println("Entered into the sync block of second thread");
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			// this.notify();

		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("out of sync block of second thread");

	}

}
