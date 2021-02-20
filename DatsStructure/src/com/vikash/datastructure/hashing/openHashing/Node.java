package com.vikash.datastructure.hashing.openHashing;

//demonstrates hash table with separate chaining

class Node {
	public int data; // data item
	public Node next; // next link in list

	public Node(int data) {
		this.data = data;
	}
	public void displayNode() {
		System.out.print(data + "-->");
	}
}
