package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		//1, 55, 66, 77, 88, 99
		int [] arr = new int[] {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Befor Sorting : "+Arrays.toString(arr));
		//bubbleSort(arr);
		bubbleSort_Recursive(arr,arr.length);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int SIZE = arr.length;
		if (arr == null || SIZE == 0)
			return;
		boolean isSwapped = true;
		for (int i = 0; i < SIZE - 1; i++) {
			for (int j = 0; j < SIZE - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// arr[j]< arr[j+1] - it will print in descending order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = false;
				}
				//System.out.println("*******************");
			}
			//System.out.println("##############");
			if (isSwapped)
				break;
		}
		//System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	// Bubble sort using with recursive
	static void bubbleSort_Recursive(int arr[], int size) {
		// Base case
		if (size == 1)
			return;
		// One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				// swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		// Largest element is fixed,recur for remaining array
		bubbleSort_Recursive(arr, size - 1);
	}
}
