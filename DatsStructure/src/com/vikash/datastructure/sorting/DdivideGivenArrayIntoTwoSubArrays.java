//Divide given Array into two subArrays.
package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class DdivideGivenArrayIntoTwoSubArrays {
	public static void main(String[] args) {
		int [] arr = new int[] {10,8,2,4,3,1};
		System.out.println("Original : "+Arrays.toString(arr));
		divideGivenArrayIntoTwoSubArrays(arr, arr.length);
	}
	
	public static void divideGivenArrayIntoTwoSubArrays(int arr[], int size) {
		// no of element into the left arrays
		int leftArrSize = 3;
		if (size < 2) {
			return;
		}
		int[] left = new int[leftArrSize];
		int[] right = new int[size - leftArrSize];

		for (int i = 0; i < leftArrSize; i++) {
			left[i] = arr[i];
		}
		for (int j = leftArrSize; j < size; j++) {
			right[j - leftArrSize] = arr[j];
		}

		System.out.println("Left  Arrays : " + Arrays.toString(left));
		System.out.println("Right Arrays : " + Arrays.toString(right));
	}
}
