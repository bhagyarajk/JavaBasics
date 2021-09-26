package com.keepitsimple.interthreadcommunication.withwaitnotify;

public class WithInterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main method ");

		CalculateSumWithInterThreadCommunication calculate = new CalculateSumWithInterThreadCommunication();
		calculate.setPriority(calculate.MAX_PRIORITY);
		calculate.start();
		Thread.currentThread().setPriority(calculate.MAX_PRIORITY);
		// If we add the below line then main thred will wait forever, because when main
		// thread executes below line
		// it will be sleeping for 5 secs, by that time the other thread aquired the
		// lock of object calculate and finished executing
		// also notified, but main thread after 5 secs aquires the lock and calls wait
		// and releases the lock waiting for someone to notify

		// Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + "  : is the running thread Name ");
		synchronized (calculate) {
			System.out.println("Enterd into the sync block of main thread ...");
			// Here main thread is calling wait method, but if this is not done in
			// synchrozed aread then it throws : IllegalMonitorStateException
			System.out.println("One line before calling wait method ...");
			calculate.wait();

			System.out.println(calculate.total);
		}

	}
}
