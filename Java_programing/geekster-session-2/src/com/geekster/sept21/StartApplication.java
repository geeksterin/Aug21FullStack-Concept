package com.geekster.sept21;

public class StartApplication {
	
	public static void main(String[] args) {
		
		String str1 = "python";
		
		String str2 = "java";
		
		System.out.println(str1.compareTo(str2));
		
		
		String str = "Java is better than python"; 
					//python than better is Java
		
		String[] strArr = str.split("");
		
		String reversedString = "";
		
		for(int i = 0; i<strArr.length; i++) {
			
			String reversedStr = reverseString(strArr[i]);
			
			reversedString = reversedString + " " + reversedStr;
		}
		
		System.out.println(reversedString);
		
		
		
	}
	
	
	public static String reverseString(String str) {
		
		String reverseStr = "";
		
		for(int i = str.length()-1; i>= 0 ;i--) {
			
			char newChar = str.charAt(i);
			
			reverseStr = reverseStr + newChar;
			
		}
		
		return reverseStr;
	}

}
