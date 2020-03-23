package com.qa.main;

public class Maths {
	
	public int addition(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public int Multiplication(int num1, int num2) {
		
		return num1 * num2;
	}
	
	public int Subtraction(int num1, int num2) {
		
		return num1 - num2;
	}
	
	
	public double Division(double num1, double num2) {
		
		if(num1 < num2) {
			
		return num1 / num2;
	} else {
		
		System.out.println("First argument needs to be smaller");
		return Double.MIN_VALUE;
	}
	}
	
	
}
