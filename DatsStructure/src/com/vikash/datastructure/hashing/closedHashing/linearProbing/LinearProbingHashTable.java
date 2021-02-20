package com.vikash.datastructure.hashing.closedHashing.linearProbing;

public class LinearProbingHashTable {
	private int currentSize, maxSize;
	private String[] keys;
	private String[] vals;

	public LinearProbingHashTable(int capacity) {
		currentSize = 0;
		maxSize = capacity;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}

	// Function to clear hash table
	public void makeEmpty() {
		currentSize = 0;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}

	// Function to get size of hash table
	public int getSize() {
		return currentSize;
	}

	// Function to check if hash table is full
	public boolean isFull() {
		return currentSize == maxSize;
	}

	// Function to check if hash table is empty
	public boolean isEmpty() {
		return getSize() == 0;
	}

	// Fucntion to check if hash table contains a key
	public boolean contains(String key) {
		return get(key) != null;
	}

	// Functiont to get hash code of a given key
	private int hash(String key) {
		return key.hashCode() % maxSize;
	}

	// Function to insert key-value pair
	public void insert(String key, String val) {
		int hashKey = hash(key);
		int index = hashKey;
		int i = 1;
		while (keys[index] != null) {
			index = (hashKey + i) % maxSize;
			if (index == hashKey) {
				System.out.println("Hash table is full!!!");
				return;
			}
			i++;
		}
		keys[index] = String.valueOf(index);
		vals[index] = val;
		currentSize++;
	}

	/** Function to get value for a given key **/
	public String get(String key1) {
		int key = hash(key1);
		int index = key;
		int i = 1;
		while (keys[index] != null) {
			if (Integer.valueOf(keys[index]) == index) {
				System.out.println("for Key :" + key1 + " value is::" + vals[index]);
				return vals[index];
			}
			index = (key + i) % maxSize;
			// System.out.println("i " + index);
			i++;
		}
		return null;
	}

	public void remove(String value) {
		int key = hash(value);
		int index = key;
		int i = 1;
		// if the value not found then check in the next index
		while (keys[index] != value) {
			index = (key + i) % maxSize;
			if (index == key) {
				System.out.println(value + " Value not found!!");
				return;
			}
			i++;
		}
		// if the value found then simply assign at that index as null
		System.out.println(value + " deleted at index :" + index);
		vals[index] = null;
		currentSize--;
	}

	// Function to print HashTable 
	public void printHashTable() {
		System.out.println("\nHash Table: ");
		for (int i = 0; i < maxSize; i++)
			if (keys[i] != null)
				System.out.println(keys[i] + " " + vals[i]);
		System.out.println();
	}
}
