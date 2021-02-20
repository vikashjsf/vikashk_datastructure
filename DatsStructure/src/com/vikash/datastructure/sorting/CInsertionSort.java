package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class CInsertionSort {
	public static void main(String[] args) {
		int [] arr = new int[] {10, 40, 50, 30, 20};
		//						0    1   2   3   4
		System.out.println("Befor Sorting : " + Arrays.toString(arr));
		insertionSort(arr);
	}

	public static void insertionSort(int arr[]) {
		int index, value;
		for (int i = 1; i < arr.length; i++) {
			index = i;
			value = arr[index];
			while (index > 0 && arr[index - 1] > value) {
				arr[index] = arr[index - 1];
				index--;
			}
			System.out.println("j--> " + index + " value :" + value);
			arr[index] = value;
		}
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
