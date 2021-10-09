package com.geekster.sept21;

public class ContainsDuplicateWithConstraint {
	
	public static void main(String[] args) {
		
		
		int[] num = {1,2,3,1,2,3};
		
		int k = 2;
		
		boolean flag = false;
		for(int i=0; i<num.length; i++) {
			
			for(int j=i+1; j<num.length; j++) {
				
				if((num[i] == num[j]) && (Math.abs(i-j) <= k)) {
				
						System.out.println("true");
						flag = true;	
						break;
				}		
			}
			if(flag) {
				break;
			}
		}
		
		if(!flag) {
			System.out.println("False");
		}
		
	}

}
