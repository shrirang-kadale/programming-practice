package com.stack.overflow;

public class RegexToRemoveCharsFromString {

	public static void main(String[] args) {
		String stringToScan = "; Pages / sec ; 0 . 1 7 ; 0 ; 0 . 1 3 ; 0 . 0 5 ; 0 . 1 ; 0 . 1 3 ; 0 . 2 5 ; 0 . 0 3 ; 0 . 0 3 ; 0 . 1 ;"; 
		String result = stringToScan.replaceAll("[^0-9\\.\\;]", "");
				
		System.out.println(result);

	}
}
