package com.vikash.datastructure.sorting;

import java.util.Arrays;

public class DMergeTwoSortedArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 18, 22, 100, 105, 1002,1005,2001 };
	    int[] arr2 = { 16, 17, 19, 21, 1001 };
	    System.out.println("Sorted Arrays1  : "+Arrays.toString(arr1));
	    System.out.println("Sorted Arrays2  : "+Arrays.toString(arr2));
	    mergeTwoSortedArrays(arr1, arr2);
	}
	
	public static void mergeTwoSortedArrays(int[]Aarr, int[]Barr) {
		int lengArr1 = Aarr.length;
		int lengArr2 = Barr.length;
		int[] Carr = new int[lengArr1 + lengArr2];
		int i = 0, j = 0, k = 0;
		
		while (i < lengArr1 && j < lengArr2) {
			if(Aarr[i] < Barr[j]) {
				Carr[k++]=Aarr[i++];
			}else {
				Carr[k++]=Barr[j++];
			}
		}
		for (; i < lengArr1; i++) {
			Carr[k++]=Aarr[i];
		}
		for (; j < lengArr2; j++) {
			Carr[k++]=Barr[j];
		}
		System.out.println("Merge Sorted Arrays : "+Arrays.toString(Carr));
	}
}
