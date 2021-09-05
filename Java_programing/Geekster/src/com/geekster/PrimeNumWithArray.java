package com.geekster;

public class PrimeNumWithArray {
	
	public static void main(String[] args) {
		
		int[] arr={1,25,3,4,5,65,7,8,9,10};
		
		
		for(int i = 0; i<arr.length;i++){
			int check=0;
			
			if(arr[i]==0||arr[i]==1)
			{
				System.out.println("not prime");
				
			}else{
				int m = arr[i]/2;
				for(int j = 2;j<=m;j++){
					if(arr[i] % j==0)
					{
						check =1;
						break;
					}
			}
			if(check==0){
				System.out.println(arr[i]+ " is prime");
			}else {
				System.out.println(arr[i]+ " not a prime");
			}
			
			}
		}
			
		}

}
