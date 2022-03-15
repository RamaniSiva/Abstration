package com.abs;

public class StringsDemo {

	public static void main(String[] args) {
		String s1="java";
		String s2="Selenium";
		String s3= "Java";
		String s4="Framework";
		
		int length = s1.length();
		System.out.println(length);
		
		String lowerCase = s2.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = s3.toUpperCase();
		System.out.println(upperCase);
		
		int indexOf = s1.indexOf('e');
		System.out.println(indexOf);
		
		int lastIndexOf = s4.lastIndexOf('o');
		System.out.println(lastIndexOf);
		
		
		boolean contains = s2.contains(s3);
		System.out.println(contains);
		
		boolean equals = s1.equals(s3);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);
		
		String trim = s1.trim();
System.out.println(trim);
		
String substring = s2.substring(2, 6);
		System.out.println(substring);
		
		boolean startsWith = s1.startsWith("sele");
		System.out.println(startsWith);
		
		boolean endsWith = s4.endsWith("rk");
		System.out.println(endsWith);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		
		
		
	}

}
