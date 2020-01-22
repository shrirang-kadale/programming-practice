package com.data.structures.sorting;

public class InsertionSort {


		public static void main(String[] args) {

			int[] arr = { 3, 5, 9, 11, 1, 6, 33, 2, 4 };
			int length = arr.length;
			
			int[] tempArr = new int[9];
			
			for(int i = 0; i < length; i++) {
				
				int newElement = arr[i];
				
				for(int j = i; j >= 0; j--) {
					
					if(tempArr[j] == 0) {
						tempArr[j] = newElement;
					}
					else if(tempArr[j] > newElement) {
						tempArr[j + 1] = tempArr[j];
						tempArr[j] = newElement;
					}
				}
			}
			
			printArray(tempArr, length);
			
		}
		
		private static void printArray(int[] arr, int length) {
			
			for(int i = 0; i < length; i++) {
				System.out.println(arr[i]);
			}
		}
}
