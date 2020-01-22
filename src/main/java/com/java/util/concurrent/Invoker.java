package com.java.util.concurrent;

import java.util.concurrent.Executor;

public class Invoker implements Executor {

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		invoker.execute();

	}

	@Override
	public void execute(Runnable r) {
		r.run();
		
	}
	
	public void execute() {
		Executor executor = new Invoker();
		
		executor.execute( () -> {
			System.out.println("Response from executor");
		});
	}

}
