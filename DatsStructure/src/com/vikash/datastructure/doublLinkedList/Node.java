package com.vikash.datastructure.doublLinkedList;

public class Node {
	public int data;
	public Node previous;
	public Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
		previous = null;
		next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", previous=" + previous.data + ", next=" + next.data + "]";
	}
}
