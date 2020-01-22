package com.data.structures.sorting;

public class SelectionSortPart2 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 6, 2 };
		int length = arr.length;
		int lastUnsortedIndex = arr.length - 1;
		
		for(int i = 1; i < length; i++) {
			
			int largest = 0;
			
			for(int j = 1; j <= lastUnsortedIndex; j++) {
				
				if(arr[largest] > arr[j]) {
						swap(arr, largest, j);
				} else {
					printArray(arr, arr.length);
					System.out.println("");
					largest = j;
				}
			}
			/*
			 * if(arr[largest] > arr[lastUnsortedIndex]) swap(arr, largest,
			 * lastUnsortedIndex);
			 */
			lastUnsortedIndex--;
		}
		
		printArray(arr, length);
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		if(arr[i] < arr[i - 1]) {
			
		} else {
			printArray(arr, arr.length);
			System.out.println("");
		}
	}
	
	private static void printArray(int[] arr, int length) {
		
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
