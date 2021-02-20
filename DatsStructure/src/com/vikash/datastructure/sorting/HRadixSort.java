package com.vikash.datastructure.sorting;
import java.util.Arrays;

public class HRadixSort {
	
	public static void main(String[] args) {
		int[] input = { 11,22,55,44,99,11,19};
		System.out.println("Before Radix Sort::"+Arrays.toString(input));
		radixsort(input,input.length);
		System.out.println("After Radix Sort::"+Arrays.toString(input));
	}

	static void radixsort(int arr[], int n) {
	    int max = maxNum(arr);
		for (int pos = 1; max / pos > 0; pos = pos * 10) {
			countingSort(arr, pos);
		}
	}
	
	public static int maxNum(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static void countingSort(int[] arr, int pos) {
		// create buckets
		int arrSize = arr.length;
		int count[] = new int[10];
		int[] b = new int[arrSize + 1];
		
		// Store the count of each element
		for (int i = 0; i < arrSize; i++) {
			int index = (arr[i] / pos) % 10;
			count[index] = count[index] + 1;
		}
		
		// Finding the index[index + 1] of corresponding given element
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = arrSize - 1; i >= 0; i--) {
			int index = (arr[i] / pos) % 10;
			b[--count[index]] = arr[i];
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < arrSize; i++) {
			arr[i] = b[i];
		}
	}
}
/*
Time Complexity = O(d*(n+k)) =  number of digit
*/