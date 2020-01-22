package com.stack.overflow;

import java.util.ArrayList;
import java.util.List;

public class ConvertingObjectToInt {

	public static void main(String[] args) {
		int i = 0;
		List<Account> accountList = new ArrayList<>();
		while(i < 10) {
		   Account account = new Account(i);
		   accountList.add(account);
		   i++;
		}
		
		System.out.println(accountList.get(3));
	}

}
