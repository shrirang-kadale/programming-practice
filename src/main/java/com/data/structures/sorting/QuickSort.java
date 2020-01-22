package com.data.structures.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = {1, 2, 5, 7, 4, 6, 11, 3, 9, 14, 12, 15, 32, 0};
		
		int low = 0;
		int high = 13;
		int j = low - 1;
		
		int length = arr.length;
		
		quickSortAlgo(arr, low, high, j);
		
		printArray(arr, length);
		

	}

	private static int[] quickSortAlgo(int[] arr, int low, int high, int j) {
		
		int pivot = arr[high];
		
		for(int i = low; i < high; i++) {
			if(arr[i] <= pivot) {
				j++;
				swapElements(arr, i, j);
			}
		}
		if(j < high - 1)
			swapPivotElement(arr, j, high);
		
		if(j < high - 1) {
			quickSortAlgo(arr, j+2, high, j+1);
		}
		return arr;
	}

	private static void swapPivotElement(int[] arr, int j, int high) {
		
		int temp = arr[j + 1];
		arr[j + 1] = arr[high];
		arr[high] = temp;
		
	}

	private static void printArray(int[] arr, int length) {
		
		for(int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void swapElements(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
