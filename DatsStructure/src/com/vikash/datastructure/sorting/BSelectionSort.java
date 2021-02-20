package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class BSelectionSort {
	public static void main(String[] args) {
		int [] arr = new int[] {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After  Sorting : " + Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		int Size = arr.length;
		if (arr == null || Size == 0)
			return;
		boolean isWapped = true;
		for (int i = 0; i < Size - 1; i++) {
			for (int j = i; j < Size - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
					isWapped = false;
				}
			}
			if (isWapped)
				break;
		}
	}
}
