package com.training;

public class Validate {

	public void validate(int age) throws Exception{
		if(age>40)
			throw new ArithmeticException();
		else
			System.out.println("Valid age");
	}
	
	public void validate1(int age) throws Exception{
		if(age>40)
			throw new ArithmeticException();
		else
			System.out.println("Valid age1");
	}
}
