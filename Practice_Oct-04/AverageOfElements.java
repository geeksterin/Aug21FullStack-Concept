package com.geekster.sept21;

public class AverageOfElements {
	
	public static void main(String[] args) {
	
		int[] arr = {1,4,6,7,86,3,2,5};
		
		double sum = 0;
		
		for(int i=0; i< arr.length; i++) {
		
			sum = sum + arr[i];
		}
		
		double avg = sum/arr.length;
		
		System.out.println(avg);
		
		
	}

}
