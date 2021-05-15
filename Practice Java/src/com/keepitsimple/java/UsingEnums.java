package com.keepitsimple.java;

public class UsingEnums {
	
	// When do we need to use the enums ?
	// The best ans would be like : when enever you have some method parameter which should 
	// accept only within the set of pre-defined values --> this is the best use case to use the enums
	// In java we can even add Methods, constructors and variables to enums
	public enum MoodType {
		Happy, Sad, Neutral;
		
	}
	public static void main(String[] args) {
		System.out.println("Lets see how your mood is ...");
	// Below two lines : take the String value and tries to convert it into enums Object only if the match found if no match found it will throw the error
	//	String name = "some random name";
	//	MoodType.valueOf(name);
		expressYourMood(MoodType.Happy);
	}
	private static  void expressYourMood(MoodType type) {
		// TODO Auto-generated method stub
		System.out.println("your mood is " + type);
		
	}
}
