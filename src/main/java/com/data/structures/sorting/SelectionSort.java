package com.data.structures.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 9, 4, 6 };
		int length = arr.length;
		int lastUnsortedIndex = arr.length - 1;
		
		for(int i = 1; i < length - 1; i++) {
			
			int largest = 0;
			
			for(int j = 1; j < lastUnsortedIndex; j++) {
				
				if(arr[largest] < arr[j]) {
					largest = j;
				}
			}
			swap(arr, largest, lastUnsortedIndex);
			lastUnsortedIndex--;
		}
		
		printArray(arr, length);
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void printArray(int[] arr, int length) {
		
		for(int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}

}
