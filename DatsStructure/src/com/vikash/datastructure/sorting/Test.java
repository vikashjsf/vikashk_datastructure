package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 8, 12, 15, 6, 3, 9, 5, 7};
		System.out.println("Befor Sorting : " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		int temp,j; 
		for (int i = 1; i < arr.length; i++) {
			j=i;
			temp =arr[j];
			
			while(j > 0 && arr[j-1] > temp) {
				arr[j] =arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}
	
	
	
}
