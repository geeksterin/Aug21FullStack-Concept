package com.geekster.sept21;

public class ReplaceMissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int n = 4;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == n) {
				arr[i] = 0;
				break;
			}
			
		}
		
		for(int nums: arr) {
			System.out.print(nums);
		}
		
	}

}
