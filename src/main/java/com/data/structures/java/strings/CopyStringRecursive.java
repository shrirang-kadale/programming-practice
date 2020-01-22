package com.data.structures.java.strings;

public class CopyStringRecursive {
	
	private static void myCopy(char[] s1, char[] s2, int index) {
		
		if(index < s1.length) {
			s2[index] = s1[index];
		
		if(s1[index] == '\0')
			return;
		
		myCopy(s1, s2, index + 1);
	}
	}
	
	public static void main(String[] args)  
	{ 
	    char s1[] = "GEEKSFORGEEKS".toCharArray(); 
	    char s2[] = new char[s1.length]; 
	    myCopy(s1, s2, 0); 
	    System.out.println(String.valueOf(s2)); 
	}

}
