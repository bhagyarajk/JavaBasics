package com.keepitsimple.generalization;

public class NameAndSound {

	public void setNameandGetSound(Animal animal, String name) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.sounds();
			cat.nameOfTheCat = name;
			System.out.println("Name of the Cat is : " + name);
		} else {
			Dog dog = (Dog) animal;
			dog.sounds();
			dog.nameOfTheDog = name;
			System.out.println("Name of the dog is : " + name);
		}
	}
}
