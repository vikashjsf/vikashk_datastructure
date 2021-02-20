package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class IHeapSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 22, 13, 17, 11, 10, 14, 12 };
		System.out.println("Befor Heap Sort :" + Arrays.toString(arr));
		int len = arr.length;
		heapSort(arr, len);
		System.out.println("After Heap Sort:" + Arrays.toString(arr));
	}

	public static void heapSort(int[] arr, int size) {
		IHeapSort heapSort = new IHeapSort();
		heapSort.buildHeap(arr, size - 1);
		int lastIndex = size - 1;
		while (lastIndex > 0) {
			swap(arr, 0, lastIndex);
			lastIndex = lastIndex - 1;
			heapSort.heapify(arr, 0, lastIndex);
		}
	}

	public void buildHeap(int arr[], int size) {
		for (int i = size / 2; i >= 0; i--) {
			heapify(arr, i, size);
		}
	}

	public void heapify(int arr[], int index, int size) {
		int left = 2 * index + 1;
		int right = left + 1;

		int max = index;

		if (left <= size && arr[left] > arr[max]) {
			max = left;
		}
		if (right <= size && arr[right] > arr[max]) {
			max = right;
		}
		if (index != max) {
			swap(arr, index, max);
			heapify(arr, max, size);
		}
	}

	public static void swap(int[] arr, int firstIdx, int secondIdx) {
		int temp = arr[firstIdx];
		arr[firstIdx] = arr[secondIdx];
		arr[secondIdx] = temp;
	}
}
