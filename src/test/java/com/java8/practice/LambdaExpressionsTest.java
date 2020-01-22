package com.java8.practice;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class LambdaExpressionsTest {

	@Test
	
	void testTreeSetSorting() {
		
		TreeSet<Integer> expected = new TreeSet<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		expected.add(25);
		expected.add(10);
		expected.add(5);
		expected.add(0);
		
		LambdaExpressions le = new LambdaExpressions();
	
		assertIterableEquals(expected, le.getSortedList());
	}

}
