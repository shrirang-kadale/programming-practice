package com.java8.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
		PredefinedFunctionalInterfaces pfi = new PredefinedFunctionalInterfaces();
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList <>();
		list.add(null);
		list.add("Shrirang");
		list.add("Ranga");
		list.add("patanga");
		list.add("");
		
		List<String> newList = pfi.removeNullAndEmptyValues(list);
		System.out.println(newList);
		System.out.println("The area is " + pfi.calculateSqare());
		System.out.println("The sum is " + pfi.calculatesum());
	}
	
	// Predicate example with method reference
	@SuppressWarnings("rawtypes")
	public boolean isEmptyCollection() {
		
		Predicate<Collection> p = Collection::isEmpty;
		List<Integer> list = new ArrayList<>();
		
		return p.test(list);
	}
	
	
	// Predicate example
	public List<String> removeNullAndEmptyValues(List<String> list) {
		
		Predicate<String> p = myString -> myString != null && !myString.isEmpty();
		
		for(String myString : list) {
			if(!p.test(myString)) {
				list.remove(myString);
			}
		}
		return list;
	}
	
	
	// Function
	public int calculateSqare() {
		
		Function<Integer, Integer> sum = a -> a*a;
		return sum.apply(10);
		
	}
	
	
	// consumer Example
	public void consumeValues() {
		
		Consumer<Integer> age = a -> System.out.print("Your age is " +a);
		age.accept(24);
		
	}
	
	
	// supplier example
	public int supplyValues() {
		
		Supplier<Integer> sup = () -> 5*5;
		return sup.get();
	}
	
	
	// Bi functional interfaces
	
	
	//BiPredicate example
	public boolean isGreaterElement(String name) {
		
		BiPredicate<Integer, Integer> biPred = (i1, i2) -> i1 > i2;
		return biPred.test(10, 5);
	}	
	
	// BiFunction
	public int calculatesum() {
		
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		return sum.apply(10, 20);
		
	}
	
}
