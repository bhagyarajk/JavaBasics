package com.keepitsimple.java;

public class AnonymousInnerClasses {

	public static void main(String[] args) throws InterruptedException {
		// this is not the object of the Runnable interface it's an object of
		// implementation class of Runnable interface
		Runnable runnable = new Runnable() {
			// Implementation of the run method which is there in Runnable interface
			// Job of the thread
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("child thread ..");
					System.out.println(Thread.currentThread().getName());

				}

			}
		}

		;
		System.out.println(runnable.getClass().getName());
		Thread thread2 = new Thread(runnable);
		// this thread is started by the main thread after getting started this will run
		// independent of the main thread
		thread2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread method");
			System.out.println(Thread.currentThread().getName());
		}

	}
}
