package com.geekster;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		int num = 123;
		
		int mid = num/2;
		
		if(num == 0 || num == 1) {
			System.out.println("Num is not prime Line-13");
		}else {
			boolean flag = false;
			
			for(int i = 2; i <= mid; i++) {
				
				if(num % i == 0) {
					System.out.println("Num is not prime");
					flag = true;
					break;
				}
				
				
			}
			
			if(flag == false){
				System.out.println("Num is prime");
			}
		}
		
	}

}
