package com.java.keepitsimple.multithreading;

/*Generally we need the props of the Thread class to be able to create the new thread for that Thread class class has many constructors 
one accepts runnable interface object where as the other is the no-argument constructor and many other constructors exists
We have this second way of creating threads because if the class has already extended another class then it can't extend the thread class 
so this method to create the thread is the preffered and more generic way of executing a piece of code 
*/

/*
If the same method of the resource is shared by the multiple threads, then few times executing concurently is not a good idea
for that reason we have something known as the thread synchronization, by using the keyword synchronized (only with the methods and the blocks not with variables )
and we can synchronize a class method or a block but the most common one is synchronizing the method

The synchronization works with the concepts of locks and keys and In java we can have an object level (Object level lock), class level locks (Entire class level lock like even if there are 1000 instances of that class in the memory only one object is allowed for one thread at a time) 
*/
public class ByImplementingRunnable {
	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}

			}

		};
		Thread thread1 = new Thread(runnable);
		thread1.setName("Thread-1");
		thread1.start();
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}
	}

}
