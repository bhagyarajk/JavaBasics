package com.keepitsimple.interthreadcommunication.raceconditionordatainconsistency;

public class WithoutInterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main method ");
		System.out.println(Thread.currentThread().getName() + "  : is the thread Name ");

		// below line is executed by the main thread
		CalculateSumWithoutInterThreadCommunication calculate = new CalculateSumWithoutInterThreadCommunication();

		// When the below line is executed, new thread has been started
		calculate.start();
		Thread.sleep(1000);
		// Now lets say main thread is waiting for an update over the object calculate,
		// because in main thread
		// I want to print the total variable which is there in object calculate
		System.out.println(calculate.total);
	}
}
