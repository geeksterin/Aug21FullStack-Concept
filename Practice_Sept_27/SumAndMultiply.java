package com.geekster.sept21;

public class SumAndMultiply {
	
	
	public static void main(String[] args) {
		
		int a = 18;
		
		int b = 32;
		
		int sum = add(a,b);
		
		System.out.println("sum is- "+ sum);
		
		int multiply = multiply(a,b);		
		
		System.out.println("Multiplication is- "+ multiply);
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		
		return a*b;
	}

}
