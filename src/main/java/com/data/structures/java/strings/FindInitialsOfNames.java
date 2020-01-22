package com.data.structures.java.strings;

public class FindInitialsOfNames {

	public static String findInitials(String s) {
		
		int length = s.length();
		String initials = s.charAt(0) +" ";
		for(int i = 0; i < length; i++) {
			if(s.charAt(i) == ' ') {
				if(s.charAt(i + 1) == ' ')
					continue;
				else
					initials = initials + s.charAt(i + 1) + " ";
			}
		}
		return initials;
	}
	
	public static void main(String[] args) {
		
		String nameInitials = findInitials("Shrirang           Sudhakar                Kadale                     ".trim());
		
		System.out.println(nameInitials);
		
	}

}
