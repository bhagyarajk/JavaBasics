package com.keepitsimple.exceptionhandling;

public class BankAppUtil {
	public static void main(String[] args) {
		System.out.println("Main method of the Bank App started");
		BankApp bankApp = new BankApp();
		bankApp.creditAmout(1000);
		System.out.println(bankApp.getBalence());
		bankApp.debitAmout(500);
		System.out.println(bankApp.getBalence());
		bankApp.debitAmout(10000);
	}

}
