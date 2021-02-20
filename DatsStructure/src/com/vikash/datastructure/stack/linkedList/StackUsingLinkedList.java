package com.vikash.datastructure.stack.linkedList;

import com.vikash.datastructure.stack.array.Stack;

public class StackUsingLinkedList implements Stack{
	private Node top;
	private int length;
	
	public StackUsingLinkedList() {
		top = null;
		length=0;
	}

	@Override
	public boolean isEmpty() {
		return (length==0);
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			top=newNode;
		}else {
			top.next=newNode;
			top=newNode;
		}
		length++;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty POP not posssible!!");
			return -1;
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	@Override
	public int peek() {
		if(isEmpty()){
			return -1;
		}
		return top.data;
	}

	@Override
	public void display() {
		 
	}

	@Override
	public boolean isStackFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

