package com.vikash.datastructure.sorting;

import java.util.Arrays;

/*

Given an array A on size N, you need to find the number of ordered pairs(i,j) such 
that i<j and A[i]>A[j]
Input:
First line contains one integer, N, size of array.
Second line contains N space separated integers denoting the elements of the array A.

*/
public class EMergeSortQuestion {
	public static void main(String[] args) {
		int [] A = new int [] {7,8,9,1,2,3};
		merge(A);
	}
	public static void merge(int[] A) {
		int i = 0, j = 1;

		int lenLeft = A.length;
		//int lenRight = right.length;

		while (i < j) {
			if (A[i] > A[j]) {
				System.out.println("Index Pari (" + i + "," + j + ")" + "Values : " + "(" + A[j] + "," + +A[j] + ")");
				j++;
			} 
		}
		
		/*System.out.println("Mergeleft : "+Arrays.toString(left));
		System.out.println("Mergeright : "+Arrays.toString(right));*/
	}
}
