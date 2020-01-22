
Incomplete


package com.data.structures.java.strings;

public class ChangeStringToNewCharacterSet {

	public static void main(String[] args) {

		String inputCharString = "qwertyuiopasdfghjklzxcvbnm";
		String outputCharString = "abcdefghijklmnopqrstuvwxyz";
		
		String input = "utta";
		
		System.out.println('u' - 'a');
		

		String output = getOutputString(inputCharString, outputCharString, input);
		
		System.out.println(output);
	}

	private static String getOutputString(String inputCharString, String outputCharString, String input) {
		
		int length = input.length();
		
		char[] charArray = inputCharString.toCharArray();
		
		for(int i = 0; i < length; i++) {
			
			char a = input.charAt(i);
			
			
			
		}
		
		return null;
	}

}
