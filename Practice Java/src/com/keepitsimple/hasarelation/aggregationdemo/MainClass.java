package com.keepitsimple.hasarelation.aggregationdemo;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main method started...");
		Student student = new Student("raj", 1);
		ClassRoom classRoom = new ClassRoom("A section", student);
		// from the above code it's pretty clear that --> A section has a student called
		// Raj
		// Aggregation is when student exists even without the ClassRoom
		System.out.println("The name of the classroom is : " + classRoom.sectionName + " and name of the student is : "
				+ classRoom.student.getName());
		// Now if
		classRoom = null;
		// by the below line you can see that even without the existence of the
		// classRoom (container) object student (contained) class is existed
		System.out.println("Name of the student is : " + student.getName());

	}

}
