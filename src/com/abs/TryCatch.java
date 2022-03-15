package com.abs;

public class TryCatch {

	public static void main(String[] args) {
		try
		{
			int i=4/0;
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("1");
		}
		catch(Exception e){
			System.out.println("2");
			
		}
	

}}
