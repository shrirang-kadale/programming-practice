package com.stack.overflow;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, String> map2 = new HashMap<>();
		Map<String, Map<String, String>> map1 = new HashMap<>();

		map2.put("Grp A", "a");
		map2.put("Grp B", "b");

		map1.put("Grp",map2);
		
		System.out.println(map1.get("Grp").get("Grp A"));
	}
}
