package com.abs;

public  class AbstractMain extends PartialAbs{

	public void fixed() {
		System.out.println("6%");
	}
	
	public void deposit() {
		System.out.println("8%");
		
		System.out.println("new data added in abs1");
		
		System.out.println("welcome to ABS");}
//<<<<<<< HEAD
		
//=======
		
//>>>>>>> 134b33a21ab1eed42bd95119315c5a8e33708fc4
	
	public static void main(String[] args) {
		AbstractMain a=new AbstractMain();
		a.deposit();
		a.savings();
		a.fixed();
		
	}

}
