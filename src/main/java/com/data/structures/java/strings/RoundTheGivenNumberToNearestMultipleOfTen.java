package com.data.structures.java.strings;

public class RoundTheGivenNumberToNearestMultipleOfTen {
	
	public static void main(String[] args) {

		int givenNumber = 3810;
		
		 int reminder = givenNumber % 10;
		 
		 int result = 0;
		 
		 if(reminder == 0)
			 result = givenNumber;
		 else if(reminder <= 5)
			 result = givenNumber - reminder;
		 else
			 result = givenNumber + (10 - reminder);
		 
		 System.out.println(result);
		
	}

}
