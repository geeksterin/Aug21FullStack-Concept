package com.geekster;

public class SumOfNNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,5,7,4,3,6,56,23,75,342,568,23,199};
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		
		System.out.println(sum);
		
		
		
	}

}
