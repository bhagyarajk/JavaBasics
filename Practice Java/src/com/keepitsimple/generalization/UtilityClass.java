package com.keepitsimple.generalization;

public class UtilityClass {
	public static void main(String[] args) {
		System.out.println("Main method started ..");
		NameAndSound nameSound = new NameAndSound();
		nameSound.setNameandGetSound(new Cat(), "Tommy");
		nameSound.setNameandGetSound(new Dog(), "Scooby Doo");

	}
}
