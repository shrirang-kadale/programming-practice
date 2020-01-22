package com.data.structures.java.array;

public class LeftArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = 7, d = 2;
		
		for(int i = 0; i < d; i++) {
			for(int j = 0; j < n-1; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
			}			
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
