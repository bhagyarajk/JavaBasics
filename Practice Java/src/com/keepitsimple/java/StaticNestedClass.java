package com.keepitsimple.java;

public class StaticNestedClass {
//	nonstatic var of the outer class
	int x;

	static class Inner {

		// nonstatic var of the inner class
		int x = 100;

		public static void main(String[] args) {
			System.out.println("from inside the main method of the Inner class ");

		}

		public void display() {

			System.out.println("inside the display method of the static inner class");
			// compile time error : cant make a static refference to the non-static
			// refference
			System.out.println(x);

			// to solve it ...
			StaticNestedClass s = new StaticNestedClass();
			System.out.println(s.x);
		}
	}
}

class OneMore {
	public static void main(String[] args) {
		StaticNestedClass.Inner inner = new StaticNestedClass.Inner();
		inner.display();
	}

}
