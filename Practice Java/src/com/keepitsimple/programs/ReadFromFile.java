package com.keepitsimple.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class ReadFromFile {
	// main driver method
	public static void main(String[] args) throws Exception {

		// File path is passed as parameter
		File file = new File("C:\\Users\\bhagyaraj\\Desktop\\Notepadd++\\filetoread.txt");

		// Creating an object of BuffferedReader class
		Set<String> issueKeys = new HashSet<String>();
		BufferedReader br = new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String st;
		// Consition holds true till
		// there is character in a string
		while ((st = br.readLine()) != null)

			// Print the string
			issueKeys.add(st);
		System.out.println("Number of Tickets read from the file is : "+ issueKeys.size());
		System.out.println(issueKeys);
	}

}
