package com.vikash.datastructure.hashing.openHashing;

public class HashTable {

	private OpenHashing[] hashArray; // array of lists
	private int arraySize;

	public HashTable(int size) {
		arraySize = size;
		hashArray = new OpenHashing[arraySize]; // create array
		for (int j = 0; j < arraySize; j++) // fill array
			hashArray[j] = new OpenHashing(); // with lists
	}

	public void displayTable() {
		for (int j = 0; j < arraySize; j++) // for each cell,
		{
			System.out.print("Bucket "+ j + ". "); // display cell number
			hashArray[j].displayList(); // display list
		}
	}

	public int hashFunc(int key) {
		return key % arraySize;
	}

	public void insert(Node node) {
		int key = node.data;
		int hashVal = hashFunc(key); // hash the key
		hashArray[hashVal].insert(node); // insert at hashVal
	}

	public void delete(int key) {
		int hashVal = hashFunc(key); // hash the key
		hashArray[hashVal].delete(key); // delete link
	}

	public Node find(int key) {
		int hashVal = hashFunc(key); // hash the key
		Node theLink = hashArray[hashVal].find(key); // get link
		return theLink;
	}
}

//http://homepage.cs.uiowa.edu/~sriram/21/spring06/code/hashChain.java