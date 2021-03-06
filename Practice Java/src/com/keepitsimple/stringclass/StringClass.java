package com.keepitsimple.stringclass;

public class StringClass {
	public static void main(String[] args) {
		String string1 = "Hello world ";
		String string2 = "Hello world ";

		// Hashcode method has been overridden to gen the hashcode based on the the
		// content of the object
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());

		// equals method also been overridden to gen the equals method
		System.out.println(string1.equals(string2));

		// toString() overridden to display the content of the method
		System.out.println(string1.toCharArray());
		System.out.println("This is my favorite font so far ....");

		char[] ch = { 'a', 'p', 'p', 'l', 'e', 'e', 'e', 'h', 'e' };
		String var1 = new String(ch);
		System.out.println("The value of the var1 is : " + var1);
		System.out.println(var1.charAt(0));
		System.out.println(var1.codePointAt(0));

		String var2 = "Hello";
		String var3 = "hello";
		// compareTo() compares two strings based on there unicode value
		System.out.println(var2.compareTo(var3));
		System.out.println(var2.lastIndexOf("l"));

		System.out.println(var1.replaceAll("e*", "o"));
		System.out.println(var1.replace("e", "o"));

		// Important ex. 1
		String var4 = "HelloWorld";
		String var5 = "Hello" + "World";

		// true
		System.out.println(var4 == var5);

		// Important ex. 2
		String var6 = "Hello";
		String var7 = var6 + "World";
		// false
		System.out.println(var6 == var7);
		// false
		System.out.println(var5 == var7);

		// Important ex. 3
		final String var8 = "Hello";
		String var9 = var8 + "World";
		// true because final variables values are placed during the compile time only
		// it means they behave as the constants in this case
		System.out.println(var9 == var5);

	}

}
