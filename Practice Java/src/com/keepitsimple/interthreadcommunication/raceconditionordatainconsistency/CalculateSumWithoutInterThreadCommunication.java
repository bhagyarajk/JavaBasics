package com.keepitsimple.interthreadcommunication.raceconditionordatainconsistency;

public class CalculateSumWithoutInterThreadCommunication extends Thread {

	int total;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
	}

}
