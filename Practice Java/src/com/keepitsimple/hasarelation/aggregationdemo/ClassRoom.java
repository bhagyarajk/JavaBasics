package com.keepitsimple.hasarelation.aggregationdemo;

public class ClassRoom {
	String sectionName;
	Student student;

// you can see that the container object only contains the reference to the contained object ie. ClassRoom object
// only contains the ref of student object, not the student object if self
	public ClassRoom(String sectionName, Student student) {
		super();
		this.sectionName = sectionName;
		this.student = student;
	}

}
