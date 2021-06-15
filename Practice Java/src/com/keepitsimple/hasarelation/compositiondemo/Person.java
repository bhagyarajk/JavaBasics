package com.keepitsimple.hasarelation.compositiondemo;

public class Person {
	String name;
	// making this final will guarantee that job is initialized explicitly
	final Job job;

// Here you can see that the contained object(Job) it self is a part of container object (Person), unlike 
// composition where the container object only contains the ref to contained objects
	Person(String name) {
		this.name = name;
		this.job = new Job("Developer");
	}

}
