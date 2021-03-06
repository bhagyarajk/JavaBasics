package com.keepitsimple.typecasting;

public class NarrowingAndWidening {
	public static void main(String[] args) {
		byte a = 10;
		short b = 10;
		int c = 10;
		long d = 10l;
		float e = 10.02f;
		double f = 10.05;

		// Implicit widening
		c = a;

		// narrowing : here you have to explicitly cast
		a = (byte) c;

		// This is becoz : for byte we have only 1 bytes and for int we have 4 bytes in
		// the memory widening will not cause any data inconsistency but narrowing will
		// cause data inconsistency so this should be done explicitly

	}
}
