package com.keepitsimple.programs;

public class TestClass extends Demo{
public static void main(String[] args) {
	System.out.println("inside the main method");

}
// below lines will give the compile time error you cant override static as non-static and no-static as static, this will give the cte
//public static void display() {
//	System.out.println("inside the display method");
//} 

}
class Demo {
	public  void display() {
		System.out.println("inside the display method");
	} 
}

