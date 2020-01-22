package com.stack.overflow;

public class Account {
	int name;
	
	public Account(int name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "" + name;
	}	
}
