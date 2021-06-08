package com.keepitsimple.programs;

import java.util.ArrayList;
import java.util.Collections;


public class SecondLargestVowelSequence {
	public static void main(String[] args) {
		System.out.println("Main method started ...");
		// Defining the string 
		// Initialize below string object with the string that you need to apply the logic to
		String test = new String("theeare");
		String testLower = test.toLowerCase();
		char arr [] = testLower.toCharArray();
		ArrayList<String> stringsOfVowels = new ArrayList<String>();
		
		// Iterating over an array
		for (int i = 0; i < arr.length; i++) {
			// writing another loop to have another pointer that can traverse on the same array
			// But we need another pointer only if the character is a vowel
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] =='i' || arr[i] == 'o' || arr[i] == 'u') {
				int j = i;
				String contiguousVowelString = "";
				while(j < arr.length && (arr[j] == 'a' || arr[j] == 'e' || arr[j] =='i' || arr[j] == 'o' || arr[j] == 'u')) {
			
					contiguousVowelString += arr[j];
					j++;
			}
				stringsOfVowels.add(contiguousVowelString);
				
			}

			
		}
		// Below I have used the lambda expression to sort the arraylist elements, and this is a java8 feature 
		Collections.sort(stringsOfVowels,(element1, element2) ->  
		(element1.length() > element2.length()) ? -1 : (element1.length() < element2.length()) ? 1 : 0);
		System.out.println("The second largest sequence of vowels is : " + stringsOfVowels.get(1).length() + " And the string is : " + stringsOfVowels.get(1));
		System.out.println("The first largest sequence of vowels is : " + stringsOfVowels.get(0).length() + " And the string is : " + stringsOfVowels.get(0));



	}

}
