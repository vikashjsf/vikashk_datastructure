package com.vikash.datastructure.hashing.closedHashing.doubleProbing;

import java.util.Arrays;

public class GDoubleProbingInsertion {
	static int arrSize = 5;
	//Nearest Prime number in arrSize i.e Price < arrSize
	static int PRIME = 3; 
	static int[] arr = new int[arrSize];
	static int noOfElement = 0;

	public static void main(String[] args) {
		insertionUsingDoubleProbing(50);
		insertionUsingDoubleProbing(70);
		insertionUsingDoubleProbing(76);
		insertionUsingDoubleProbing(85);
		insertionUsingDoubleProbing(92);

		System.out.println("After Insertion Using Double Probing::" + Arrays.toString(arr));
		System.out.println("Total Number of Elements :" + getSize());
		clear();
		System.out.println("Afte Clear Given array ::" + Arrays.toString(arr));
	}

	static {
		// Initializing with -1 the hash table
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
		System.out.println("Initial Arrays :" + Arrays.toString(arr));
	}

	public static void insertionUsingDoubleProbing(int value) {
		int hash1 = value % arrSize;
		int hash2 = PRIME - value % PRIME;
		int i = 1;
		int index = hash1;
		 
		while (arr[index] != -1) {
			index = (hash1 + i * hash2) % arrSize;
			if (index == hash1) {
				System.out.println("Hash table is full!!!");
				return;
			}
			i++;
		}
		// System.out.println("i::"+i +" value:: "+value);
		arr[index] = value;
		noOfElement = noOfElement + 1;
	}

	public static void clear() {
		arr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
	}

	public static int getSize() {
		return noOfElement;
	}
}