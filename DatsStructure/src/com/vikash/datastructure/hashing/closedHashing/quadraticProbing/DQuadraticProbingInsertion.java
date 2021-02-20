package com.vikash.datastructure.hashing.closedHashing.quadraticProbing;

import java.util.Arrays;

public class DQuadraticProbingInsertion {
	//Try to give arrSize with Prime Number 3, 5, 7, 11, 13 ..
	static int arrSize = 7;
	static int[] arr = new int[arrSize];
	
	static {
		// Initializing with -1 the hash table
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
		System.out.println("Initial Arrays :" + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		quadraticProbingInsertion(50);
		quadraticProbingInsertion(700);
		quadraticProbingInsertion(76);
		quadraticProbingInsertion(85);
		quadraticProbingInsertion(92);
		quadraticProbingInsertion(73);
		quadraticProbingInsertion(70);
		System.out.println("After Insertion Using Quadratic Probing::" + Arrays.toString(arr));
	}

	public static void quadraticProbingInsertion(int value) {
		int key = value % arrSize;
		int index = key;
		int i = 1;
		while (arr[index] != -1) {
			index = (key + i * i) % arrSize;
			if (index == key) {
				System.out.println("Hash table is full!!! while inserting value::" + value);
				return;
			}
			i++;
		}
		// In case of no collision
		arr[index] = value;
	}
}
