package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class DMergeSort {
	public static void main(String[] args) {
		int [] arr = new int[] {10,8,2,4,3,1,7,6};
		System.out.println("Befor Sorting : "+Arrays.toString(arr));
		mergeSort(arr,arr.length);
		System.out.println("After Sorting : "+Arrays.toString(arr));
		
	}
	
	public static void mergeSort(int[] arr, int n) {
		if (n < 2)
			return;
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int j = mid; j < n; j++) {
			right[j - mid] = arr[j];
		}
		System.out.println("Left : " + Arrays.toString(left));
		System.out.println("Right: " + Arrays.toString(right));
		mergeSort(left, left.length);
		System.out.println("*************");
		mergeSort(right, right.length);
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		int lenLeft = left.length;
		int lenRight = right.length;

		while (i < lenLeft && j < lenRight) {
			if (left[i] < right[j]) {
				//left[i] < right[j] - Ascending
				//left[i] > right[j] - Descending
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		for (; i < lenLeft; i++) {
			arr[k++] = left[i];
		}
		for (; j < lenRight; j++) {
			arr[k++] = right[j];
		}
		System.out.println("Mergeleft : "+Arrays.toString(left));
		System.out.println("Mergeright : "+Arrays.toString(right));
		System.out.println("MergeArr : "+Arrays.toString(arr));
	}
}


