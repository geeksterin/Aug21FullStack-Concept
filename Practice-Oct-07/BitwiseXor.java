package com.geekster.sept21;

public class BitwiseXor {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,2,1,4};
		
		int xor = 0;
		
		
		for(int value: arr) {
			xor = xor ^ value;
		}
		
		int x = 0;
		int y = 0;
		
		int rsbm = xor & -xor;
		
		for(int value: arr) {
			if((value & rsbm) == 0) {
				x = x^value;
			}else {
				y = y ^ value;
			}
		}
		System.out.println("x="+ x +"y- "+ y);
		
	}

}
