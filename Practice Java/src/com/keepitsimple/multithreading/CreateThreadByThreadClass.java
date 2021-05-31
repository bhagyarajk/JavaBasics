package com.keepitsimple.multithreading;

// Here we shown how to create a thread by extending the thread class

/*
Thread.currentThread()--> static method gives the object of currently running thread
start() --> Once you run the start method the ThreadScheduler will allocate the separate sys resources to the invoked thread
stop() --> Thread dies, after this you can't restart the thread again 
run() --> Job of the thread
setName() --> give the name to the thread
getName() --> get the name of the thread
getPriority() --> get's the thread priority : Thread with the higher priority more likely to get cpu time earlier than the thread with low priority
setPriority() --> set's the thread priority : Priority must be within Thread.MAX_PRIORITY, Thread.MIN_PRIORITY to avoid the exception values can be 1-10
and many more 
*/

public class CreateThreadByThreadClass {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started");
		DemoThread thread1 = new DemoThread();
		thread1.setName("Thred-1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();

		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i + " : And the value of the Priority is : "
					+ Thread.currentThread().getPriority());
		}
	}
}

class DemoThread extends Thread {
	// Job of the thread
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i + " : And the value of the Priority is : "
					+ Thread.currentThread().getPriority());

		}
	}
}
