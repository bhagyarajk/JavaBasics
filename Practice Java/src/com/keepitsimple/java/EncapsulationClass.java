package com.keepitsimple.java;

public class EncapsulationClass {
	public static void main(String[] args) {
		System.out.println("Main method started ..");
		User user = new User();
		user.setUserName("bhagyaraj.k");
		System.out.println("the username is : " + user.getUserName());
	}
}

// Here the user class has been encapsulated : Means all the variables in that is declared private and they are only accessible through the public methods
// Benifit : by using this encapsulation we can keep some fields only readable or writable and we can even control the values that the fields can have 
class User {
	private String username;
	private String password;

	public void setUserName(String username) {
		this.username = username;
	}

	public void setPassword() {
		this.password = password;
	}

	public String getUserName() {
		return this.username;
	}
	// Password you can't get

}
