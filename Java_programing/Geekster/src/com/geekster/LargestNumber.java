package com.geekster;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,56,34,23,7,96,12,65,235,77,0};
		
		if(arr.length > 0) {
			
			int max = arr[0];
			
			int i = 0;
			
			while(i < arr.length) {
				
				if(arr[i] > max) {
					max = arr[i];
				}
				
				i++;
				
			}
			System.out.println(max);
		}
		
		
		
		
	
	}

}
