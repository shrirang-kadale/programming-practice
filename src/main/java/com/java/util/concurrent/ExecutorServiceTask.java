package com.java.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceTask {

	
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		executor.submit(() -> {
			System.out.println("I am Runnable task");
		});
		
		Future<Integer> future = executor.submit(() -> {
			System.out.println("I am Callable task");
			return 1 + 1;
		});
		
		
		try {
			otherTask("Before future task");
			
			Integer result = future.get(10, TimeUnit.SECONDS);
			
			System.out.println("Get future tasks : " + result);
			
			otherTask("After future task");
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		} catch(ExecutionException e) {
			e.printStackTrace();
		} catch(TimeoutException e) {
			e.printStackTrace();
		} 
		finally {
			executor.shutdown();
		}
		
		

	}

	public static void otherTask(String name) {
		System.out.println("I am in other task! " + name);
	}
}
