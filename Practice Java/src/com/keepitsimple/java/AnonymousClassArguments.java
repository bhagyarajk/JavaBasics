package com.keepitsimple.java;

// this will show how the anonymous class can be passed as an argument 
public class AnonymousClassArguments {
	public static void main(String[] args) {
		new Thread(new Runnable() {
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

		).start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ..");
			System.out.println(Thread.currentThread().getName());
		}
	}

}
