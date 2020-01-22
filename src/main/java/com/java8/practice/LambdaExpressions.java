package com.java8.practice;

import java.util.Set;
import java.util.TreeSet;

public class LambdaExpressions {

	public static void main(String[] args) {

		LambdaExpressions le = new LambdaExpressions();
		
		Set<Integer> sortedList = le.getSortedList();
		
		System.out.println(sortedList);
		
	}
	
	public Set<Integer> getSortedList() {
		TreeSet<Integer> ts = new TreeSet<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		ts.add(10);
		ts.add(5);
		ts.add(25);
		ts.add(0);
		
		return ts;
	}
	
	

}
