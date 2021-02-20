package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class FQuickSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 16, 8, 12, 15,7};
		int length = arr.length;
		System.out.println("Befor Sorting : " + Arrays.toString(arr));
		quickSortRecursion(arr, 0, length - 1);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

	public static void quickSortRecursion(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	public static int partition(int[] A, int low, int high) {
		int midIndex = (low + high) / 2;
		int pivot = A[midIndex];
		while (low <= high) {

			while (A[low] < pivot) {
				low++;
			}
			while (A[high] > pivot) {
				high--;
			}
			if (low <= high) {
				System.out.println(
						"Pivot :" + pivot + " Low :" + low + " High :" + high + " Before : " + Arrays.toString(A));
				int temp = A[low];
				A[low] = A[high];
				A[high] = temp;
				low++;
				high--;
				System.out.println(
						"Pivot :" + pivot + " Low :" + low + " High :" + high + " After : " + Arrays.toString(A));
			}
		}
		System.out.println("Low::"+low);
		return low;
	}
}