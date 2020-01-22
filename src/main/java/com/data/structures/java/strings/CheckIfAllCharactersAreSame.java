package com.data.structures.java.strings;

public class CheckIfAllCharactersAreSame {

	public static boolean isSameCharacters(String s) {
	
		int length = s.length();
		
		for(int i = 0; i < length - 1; i++) {
			
			if(s.charAt(i) != s.charAt(i + 1))
				return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean isAllSimilarCharacters = isSameCharacters("qqqqqqqqqqqqqqqqqqqqqQQQ".toLowerCase());
		
		if(isAllSimilarCharacters)
			System.out.println("All chars are same");
		else
			System.out.println("All chars are not same");
		
	}

}
