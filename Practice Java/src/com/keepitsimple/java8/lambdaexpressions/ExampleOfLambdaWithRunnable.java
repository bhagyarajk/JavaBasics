package com.keepitsimple.java8.lambdaexpressions;

public class ExampleOfLambdaWithRunnable {
	public static void main(String[] args) {
		System.out.println("main method started ...");
		// Lambda expression for the same
		// We have to use the lambda expressions wherever you have functional interface
		// Syntax you can see that
		// for more details have to go through the notes
		Runnable runnable = () -> {
			Thread.currentThread().setName("child thread");

			// Here the job of the run method should come
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " : Running : " + i);
			}
		};
		Thread childThread = new Thread(runnable);
		childThread.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("Main thread : " + i);
		}
	}

}
