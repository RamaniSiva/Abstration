package com.abs;

public class InterfaceExample {

	
		interface MyInterface{
			   public void demo();
			   public static void display() {
			      System.out.println("This is a static method");
			   }
			}
			
			   public void demo() {
			      System.out.println("This is the implementation of the demo method");
			   }
			   public static void main(String args[]) {
			      InterfaceExample obj = new InterfaceExample();
			      obj.demo();
			      MyInterface.display();
			   }
			
	}


