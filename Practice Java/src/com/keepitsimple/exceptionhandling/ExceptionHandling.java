package com.keepitsimple.exceptionhandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		DemoException exception = new DemoException();
		exception.display();

	}
}

class DemoException {

	public void display() {
		try {
			System.out.println(2 / 0);
			System.out.println("display method of the DemoException");
		} catch (Exception exception) {

			exception.printStackTrace();
		} finally {
			System.out.println(
					"This is the finally block and no matter whether the exception occures or not these lines of code will be executed");
		}

	}
}
