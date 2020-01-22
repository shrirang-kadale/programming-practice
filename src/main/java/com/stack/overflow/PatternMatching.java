package com.stack.overflow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args){
	    Pattern p = Pattern.compile("^Date");
	    Matcher m = p.matcher("Dategggggggggg");
	    System.out.println(m.find());
	}
}
