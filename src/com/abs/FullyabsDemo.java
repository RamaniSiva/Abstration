package com.abs;

public class FullyabsDemo implements FullyAbs,FullyAbs1 {
	
	public void fixed() {
		System.out.println("9%");
	}
	public void deposit() {
		System.out.println("7%");
	}
	public void savings() {
		System.out.println("3%");
	}
	public static void main(String[] args) {
		FullyabsDemo f=new FullyabsDemo();
		f.deposit();
		f.fixed();
		f.savings();
		

	}

}
