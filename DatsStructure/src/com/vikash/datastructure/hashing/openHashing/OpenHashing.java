package com.vikash.datastructure.hashing.openHashing;

public class OpenHashing {

	private Node head;

	public void OpenHashing() {
		head = null;
	}

	// insert Node
	public void insert(Node newNode) {
		Node temp = head;
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// delete Node
	public void delete(int key) { 
		Node previous = null; // start at head
		Node temp = head;
		// until end of list,
		while (temp != null && key != temp.data) { // or key == current,
			previous = temp;
			temp = temp.next; // go to next Node
		}
		// disconnect Node
		if (previous == null) // if beginning of list
			head = head.next; // delete head Node
		else // not at beginning
			previous.next = temp.next; // delete current Node
	}

	// find Node
	public Node find(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key)
				return temp;
			temp = temp.next;
		}
		return null; 
	} 

	public void displayList() {
		System.out.print("Linked List (head-->last): ");
		Node current = head; // start at beginning of list
		while (current != null) {
			current.displayNode(); // print data
			current = current.next; // move to next Node
		}
		System.out.print("Null");
		System.out.println("");
	}
}
