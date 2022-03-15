package com.abs;

public  class AbstractMain extends PartialAbs{

	public void fixed() {
		System.out.println("6%");
	}
	
	public void deposit() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		AbstractMain a=new AbstractMain();
		a.deposit();
		a.savings();
		a.fixed();
		
	}

}
