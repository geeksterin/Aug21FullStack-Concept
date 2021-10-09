package com.geekster.sept21;

public class Merge2SortedArrays {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,0,0,0,0,0,0};
		int arr2[] = {2,4,5,7,8,9};
		
		int m = 3;
		int n = 3;
		
		int p1 = m-1;
		int p2 = n-1;
		
		int index = arr1.length-1;

		while(p2>=0) {
			if(arr2[p2] > arr1[p1]) {
				arr1[index] = arr2[p2];
				p2--;
				index--;
			}else {
				arr1[index] = arr1[p1];
				index--;
				p1--;
				
			}
			
		}
		
		System.out.println(arr1[1]);
		
	}
}
	