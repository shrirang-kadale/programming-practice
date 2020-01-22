package com.data.structures.java.array;

public class SplitArrayAddFirstPartToEnd {
	
	public static void splitAndMerge(int[] arr, int k) {
		
		int[] newArr = new int[6];
		int length = arr.length;
		
		for(int i = 0; i < length - k; i++) {
			newArr[i] = arr[i + k];
		}
		
		for(int i = 0; i < k; i++) {
			newArr[length - k + i] = arr[i];
		}
		
		for(int i = 0; i < length; i++) {
			System.out.println(newArr[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 1, 2, 3, 4};
		
		// How many elements you want to split and merge 
		int k = 4;
		
		splitAndMerge(arr, k);
 		
	}

}
