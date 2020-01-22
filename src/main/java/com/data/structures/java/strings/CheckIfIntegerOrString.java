package com.data.structures.java.strings;

public class CheckIfIntegerOrString {
	
	public static boolean isNumber(String s) {
		
		int length = s.length();
		System.out.println(length);
		for(int i = 0; i < length; i++) {
			if(!Character.isDigit(s.charAt(i))) 
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		boolean isNumber = isNumber("q127");
		
		if(isNumber)
			System.out.println("Number");
		else
			System.out.println("String");
			
	}

}
