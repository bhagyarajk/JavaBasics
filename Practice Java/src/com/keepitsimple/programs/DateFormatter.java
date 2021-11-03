package com.keepitsimple.programs;

import java.util.Calendar;

public class DateFormatter {
	public static void main(String[] args) {
		System.out.println("Main method started ...");

		long date = 85729101221l;
		/*
		 * Date formattedDate = new Date(date); System.out.println(formattedDate);
		 */

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(date);
		System.out.println(cal.get(Calendar.YEAR));
	}
}
