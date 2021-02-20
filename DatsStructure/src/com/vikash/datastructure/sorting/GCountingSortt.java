package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class GCountingSortt {

	// Driver code
	public static void main(String args[]) {
		int[] data = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
		int size = data.length;
		GCountingSortt cs = new GCountingSortt();
		cs.countSort(data, size);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

	void countSort(int arr[], int size) {
		
		int[] b = new int[size + 1];
		// Find the largest element of the array
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		
		// Creating count array with size max +1 and initialized with zero by default.
		int[] count = new int[max + 1];

		// Store the count of each element
		for (int i = 0; i < size; i++) {
			count[arr[i]] = count[arr[i]] + 1;
		}

		// Finding the index[index + 1] of corresponding given element
		for (int i = 1; i <= max; i++) {
			count[i] = count[i] + count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = size - 1; i >= 0; i--) {
			b[--count[arr[i]]] = arr[i];
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < size; i++) {
			arr[i] = b[i];
		}
	}
}
