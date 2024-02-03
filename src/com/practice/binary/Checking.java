package com.practice.binary;

class Exaple{
	
	 void show() {
		System.out.println("private example method");
	}
}

public class Checking extends Exaple {
	
	@Override
	void show() throws ArithmeticException{
		int i=50/0;
		System.out.println("private checking method");
	}
	

	
	public static void main(String[] args) {
		
		Exaple checking=new Checking();
		checking.show();
	}
}
