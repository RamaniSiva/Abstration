package com.abs;

public class StringMethod {
	public static void main(String[] args) {
	
	String s1="java";
	String s2="java";
	
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	
	String s3= new String("java");
	String s4=new String("java");

	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));

	//immutable String
	
	String s5= new String("Selenium");
	String s6=new String("Selenium");
	String concat = s6.concat(s5);
	System.out.println(concat);

	System.out.println(System.identityHashCode(s5));
	System.out.println(System.identityHashCode(s6));
	
//mutable
	StringBuffer s=new StringBuffer("python");
	StringBuffer s7=new StringBuffer("python");
StringBuffer append = s7.append(s);
System.out.println(append);


System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s7));
System.out.println(System.identityHashCode(append));

	}

}
