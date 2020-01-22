package com.data.structures.java.array;

public class RotationCountInRotatedSortedArray {
	
	private static int countRotations(int[] arr, int n) {
		int min = arr[0];
		int minIndex = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	} 

    public static void main (String[] args)  
    { 
        int arr[] = {7, 9, 11, 12, 5, 4, 3, 2, 1};
        int n = arr.length; 
      
        System.out.println(countRotations(arr, n)); 
    }
} 
