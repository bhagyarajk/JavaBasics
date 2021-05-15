package com.keepitsimple.java;

public class OuterClass {
	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();

	}

	class InnerClass {
		public void display() {
			System.out.println("inside the display method of the inner class ...");
		}
	}

}
