package com.keepitsimple.java;

import java.util.Scanner;

public class LoopingAndBranching {
	
	public static void main(String[] args) {
		System.out.println("enter the name : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		double test = 0.0;
		
		// Only int,String and the enum values are allowed...
		switch(name) {
		case "bhagyaraj" : 
			System.out.println("you are Raj..");
			break;
			
		case "Ramesh" :
			System.out.println("You are ramesh ..");
			break;
		default : 
			System.out.println("You are not Raj...");
			break;
		}
	}

}
