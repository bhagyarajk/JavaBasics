package com.keepitsimple.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithStudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("bhagyaraj", 10);
        Student student2 = new Student("ramesh", 2);
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        Collections.sort(list, (element1, element2) -> (element1.getId() > element2.getId()) ? -1 :  (element1.getId() < element2.getId()) ? 1 : 0);
        System.out.println(list);

 }
}
