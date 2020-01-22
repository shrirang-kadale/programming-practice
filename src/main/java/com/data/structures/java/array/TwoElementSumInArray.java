package com.data.structures.java.array;

public class TwoElementSumInArray {
	
		// This function returns true if arr[0..n-1] 
		// has a pair with sum equals to x. 
	static int count = 0;
		static int pairInSortedRotated(int arr[], 
										int n, int x) 
		{ 
			for(int i = 0; i < n-1; i++) {
				for(int j = i + 1; j < n-1; j++) {
					if(arr[i] + arr[j] == x)
						count++;
				}
			}
			return count; 
		} 

		/* Driver program to test above function */
		public static void main (String[] args) 
		{ 
			int arr[] = {12, 15, 6, 8, 9, 10}; 
			int sum = 19; 
			int n = arr.length; 
		
			int count = pairInSortedRotated(arr, n, sum);
			if(count > 0)
				System.out.print("Array has two elements" + 
								" with sum 19 and count is " + count); 
			else
				System.out.print("Array doesn't have two" + 
								" elements with sum 19 "); 
		} 
}
