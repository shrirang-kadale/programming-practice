package com.data.structures.sorting;

public class BubbleSortPart1 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 9, 4, 6 };
		int length = arr.length;
		int lastUnsortedIndex = arr.length - 1;
		// For hackerrank challenge
		int count = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < lastUnsortedIndex; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					// For hackerrank challenge
					count++;
				}
			}
		}

		// For hackerrank challenge
		  System.out.println("Array is sorted in " + count + " swaps.");
		  System.out.println("First Element: " + arr[0]);
		  System.out.println("Last Element: " + arr[length - 1]);
		 

		printArray(arr, length);

	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr, int length) {

		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}

}
