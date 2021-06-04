package com.keepitsimple.java8.lambdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SortingWithSet {
public static void main(String[] args) {
	System.out.println("main method started ..");
	Set<String> hashSet = new HashSet<String>();
	hashSet.add("Hello");
	hashSet.add("Welcome");
	hashSet.add("to Java");
	hashSet.add("Hello");
	// output cant be predicted as the insertion order is not preserved
	System.out.println(hashSet);
	// sort method of the collection is only applicable for list type not the Set collections so the bellow line will throw CTE
	//Collections.sort(hashSet);
	
	// If we want to sort the Set, then we must go for TreeSet which is the implementation class for NavigableSet which inturn implements SortedSet interface rather than the HashSet
	
	Set<String> treeSet = new TreeSet<String>();
	treeSet.add("Hello");
	treeSet.add("Welcome");
	treeSet.add("To");
	treeSet.add("Java");
	treeSet.add("Hello");
	treeSet.add("to");
	
	
	// Output : [Hello, Java, To, Welcome, to]
	
	//Output you can predict, it will be there in the default natural sorting order, keep in mind that the sorting will happen by comparing the 
	// Unicode values for the each letter incase of strings, so for Z and a --> a will definitely come after Z as the value of the a is more than the capital Z
	System.out.println(treeSet);
	
	// If we want the customize sorting order then we must implement the Comparator interface compare(), then these TreeSet constructor will accept the same comparator object ref
	
	Comparator<String> comparator = (element1, element2) -> ((element1.codePointAt(0) > element2.codePointAt(0))) ? -1 :((element1.codePointAt(0) < element2.codePointAt(0))) ? 1 : 0;
	
	Set<String> treeSetWithCustomSort = new TreeSet<String>(comparator);
	treeSetWithCustomSort.add("Hello");
	treeSetWithCustomSort.add("Welcome");
	treeSetWithCustomSort.add("To");
	treeSetWithCustomSort.add("Java");
	treeSetWithCustomSort.add("Hello");
	treeSetWithCustomSort.add("to");	
	
	// this time the output should be invert of the default natural sorting order 
	 System.out.println(treeSetWithCustomSort);
	 
}  
}
