package com.geekster.sept21;

import java.util.Scanner;

public class VoteByAgeMethod {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter age of person- ");
		int age = scan.nextInt();
		
		boolean flag = validateAge(age);
		
		if(flag == true) {
			System.out.println("Person can vote");
		}else{
			System.out.println("Person can't vote");
		}
		
		
		
	}
	
	
	public static boolean validateAge(int age) {
		
		if(age >= 18) {
			return true;
		}else {
			return false;	
		}
		
	}

}
