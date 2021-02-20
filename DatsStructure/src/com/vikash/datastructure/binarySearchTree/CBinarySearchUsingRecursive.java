package com.vikash.datastructure.binarySearchTree;

import java.util.Arrays;

public class CBinarySearchUsingRecursive {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// System.out.println("Given Arrays : "+Arrays.toString(arr));
		Arrays.sort(arr);
		// System.out.println("After Sort : "+Arrays.toString(arr));
		int searchNumber=70;
		int length = arr.length;
		int index = binarySearch(arr, searchNumber, 0, length - 1);

		if (index >= 0) {
			System.out.println("Number is present at index values :" + index);
		} else {
			System.out.println("Sorry!! Given number is not present in the list.");
		}
	}

	private static int binarySearch(int[] arr, int value, int low, int high) {
		if (high < low)
			return -1;
		int middle = (high + low) / 2;
		if(value == arr[middle]) {
			return middle;
			// yes we got the element in binary search tree
		}else if(value < arr[middle]) {
			return binarySearch(arr, value, low, middle - 1);
		}else {
			return binarySearch(arr, value, middle + 1, high);
		}
	}
}
