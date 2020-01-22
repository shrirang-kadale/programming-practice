package com.data.structures.java.strings;

import java.util.HashSet;
import java.util.Set;

public class PangramChecking {
	
	private static boolean checkForPangram(String str) {
	
		Set<Character> s = new HashSet<>();
		
		char[] ch = str.toCharArray();
		
		for(Character c : ch) {
			if(c != ' ')
				s.add(c);
		}
		
		return s.size() == 26;
	}
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		boolean isPangram = checkForPangram(str.toLowerCase());
		
		System.out.println(isPangram);
	}

}
