package com.vikash.datastructure.singleLinkedList;

public class SingleLinkedList {
	public Node head;
	public int size;
	
	public SingleLinkedList() {
		head = null;
		size =0;
	}
	 
	public boolean isEmpty() {
		return (size==0);
	}
	 
	public int getSize() {
		return size;
	}
	 
	public void addFirst(int val) {
		Node newNode = new Node(val);
		Node temp;
		if(head == null) {
			head = newNode;
		}else {
			temp = head;
			newNode.next=temp;
			head =newNode;
		}
		size++;
	}
	 
	public void addLast(int val) {
		Node newNode = new Node(val);
		Node temp;
		if(isEmpty()) {
			addFirst(val);
		}else{
			temp = head;
			while(temp.next !=null) {
				temp = temp.next;
			}
			temp.next=newNode;
			size++;
		}
	}
	 
	public void addGivenPosition(int val, int position) {
		if(isEmpty() || position == 1) {
			addFirst(val);
		}else if(position <  1 || position > size+1) {
			System.out.println("Ivalide Position Insertion is not possible!!");
		}else {
			Node newNode = new Node(val);
			Node temp, current;
			temp = head;
			int count = 1;
			 while(count < position-1) {
				 temp = temp.next;
				 count++;
			 }
			 current = temp.next;
			 newNode.next = current;
			 temp.next=newNode;
			 size++;
		}
	}
	 
	public void deleteFirst() {
		if(head ==null) {
			return;
		}
		Node first = head;
		head = head.next;
		first.next=null;
		size--;
	}
	 
	public void deleteLast() {
		if (head == null) {
			return;
		} else if (size == 1) {
			deleteFirst();
		} else {
			Node last = head;
			Node temp = null;
			while (last.next != null) {
				temp = last;
				last = last.next;
			}
			temp.next = null;
			size--;
		}
	}
	 
	 
	public void deleteAtGivenPosition(int position) {
		if (head == null) {
			return;
		} else if (position == 1) {
			deleteFirst();
		} else if (position == size) {
			deleteLast();
		} else if (position < 1 || position > size) {
			System.out.println("Deletetion is not possible !!");
		} else {
			Node current = head;
			Node temp = null;
			int count = 0;
			while (count < position - 1) {
				temp = current;
				current = current.next;
				count++;
			}
			temp.next = current.next;
			current.next = null;
			size--;
		}
	}
	 
	public void createList() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		size = 5;
	}
	
	public boolean contains(int key) {
		Node temp =head;
		while(temp!=null) {
			if(temp.data == key)
				return true;
			else
				temp = temp.next;
		}
		return false;
	}
	
	public void reverseLinkedList() {
		if (head == null) {
			return;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		// Print reverse element
		if (isEmpty()) {
			return;
		}
		Node temp = previous;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("Null\n");
	}
}
