package com.keepitsimple.java8.lambdaexpressions;

import java.util.Map;
import java.util.TreeMap;

public class SortingWithMap {
	public static void main(String[] args) {
		System.out.println("Inside the main method ..");
		Map<Integer,String> treeMap = new TreeMap();
		treeMap.put(10, "Hello");
		treeMap.put(11, "Welcome");
		treeMap.put(12, "to");
		treeMap.put(20, "java");
		treeMap.put(14, "Hello");
		treeMap.put(15, "check");
		
		// Insertion order not preserved, default natural sorting order
		System.out.println(treeMap);
		
	    // If we want that to be descending then we will implement the compare method of the comparator 
		
		// we are passing the lambda expression as the argument for the TreeMap constructor this will allow us to define the sorting order
		Map<Integer, String> treeMapWithLambda = new TreeMap<Integer, String>((element1, element2) -> (element1 > element2) ? -1 : (element1 < element2) ? 1 : 0);
		treeMapWithLambda.put(10, "Hello");
		treeMapWithLambda.put(20, "Welcome");
		treeMapWithLambda.put(4, "to Java");
		treeMapWithLambda.put(50, "Just checking");
		System.out.println("Tree Map after the customized sorting : " + treeMapWithLambda);
	}

}
