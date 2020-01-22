package com.data.structures.java.array;

public class ArrayELementMultiplyByIndexMaxSum {

	static int[] arr = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static int length = arr.length;
	static int sum = 0;
	
	private static int getMaxElementIndex(int[] arr) {
		
		int max = arr[0];
		int index = 0;
		for(int i = 1; i < length-1; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;

	}

	private static int[] rotateArray(int[] arr, int length, int rotations) {
		for(int i = 0; i < rotations; i++) {
			int temp = arr[i];
			arr[i] = arr[length - rotations + i];
			arr[length - rotations + i] = temp;
		}
		
		return arr;
	}
	
	private static int calculateArrayElementMultiplyByIndexSum(int[] arr) {
		
		for(int i = 0; i < length; i++ ) {
			sum = sum + arr[i] * i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int maxElementIndex = getMaxElementIndex(arr);
		
		int rotations = length - maxElementIndex - 1;
		
		rotateArray(arr, length, rotations);
		
		calculateArrayElementMultiplyByIndexSum(arr);
		
		System.out.println("sum is " + sum);

	}


}
