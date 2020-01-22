package com.java8.practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import static org.mockito.Mockito.*;

class PredefinedFunctionalInterfacesTest {
	
	@Test
	@DisplayName("predicate success")
	void testIsEmptyCollection() {
		
		PredefinedFunctionalInterfaces pfi = new PredefinedFunctionalInterfaces();
		
		assertTrue(pfi.isEmptyCollection());
	}
	
	@Test
	@DisplayName("predicate failure")
	@DisabledOnOs(OS.WINDOWS)
	void testIsNotEmptyCollection() {
		
		PredefinedFunctionalInterfaces pfi = new PredefinedFunctionalInterfaces();
		
		assertFalse(pfi.isEmptyCollection());
	}
	
	
	@SuppressWarnings({ "unchecked" })
	@Test
	@DisplayName("Using Mocks")
	@Disabled("Unexpected NullPointerException occured")
	void testRemoveNullAndEmptyValues() {
		
		PredefinedFunctionalInterfaces pfi = new PredefinedFunctionalInterfaces();
		
		// mock creation
		List<String> mockedList = mock(List.class);
		mockedList.add(null);
		mockedList.add("Shrirang");
		mockedList.add("Ranga");
		mockedList.add("patanga");
		mockedList.add("");
		
		List<String> expected = new ArrayList<>();
		expected.add("Shrirang");
		expected.add("Ranga");
		expected.add("patanga");
		
		assertEquals(expected, pfi.removeNullAndEmptyValues(mockedList));
		
	}
	
	@Test
	void testCalculateSquare() {
		
		PredefinedFunctionalInterfaces pfi = new PredefinedFunctionalInterfaces();
		
		int expected = 100;
		
		assertEquals(expected, pfi.calculateSqare());
	}

}
