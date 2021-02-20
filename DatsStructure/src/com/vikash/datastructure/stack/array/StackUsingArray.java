package com.vikash.datastructure.stack.array;

import java.util.NoSuchElementException;

public class StackUsingArray implements Stack{
	private int top;
	private int length;
	private int[] arr;
	private int size;
	
	public StackUsingArray(int stackSize) {
		top =-1;
		length=0;
		size=stackSize;
		arr = new int[size];
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public int getLength() {
		return length;
	}
	
	@Override
	public boolean isStackFull() {
		return (top==size-1);
	}

	@Override
	public void push(int data) {
		if (top >= size - 1) {
			throw new IndexOutOfBoundsException("Stack OverFlow Exception!!");
		} else {
			arr[++top] = data;
			length++;
		}
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack UnderFlow Exception!!");
		}
		length--;
		int x =arr[top--];
		return x;
	}

	@Override
	public int peek() {
		System.out.println("Top :"+ top);
		if(isEmpty()) {
			throw new NoSuchElementException("Stack UnderFlow Exception!!");
		}
		return arr[top];
	}

	@Override
	public void display() {
		System.out.println("Display : top " +top);
		if(isEmpty()) {
			System.out.println("Stack Is Empty!!");
		}else {
			for (int i = top; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}
	} 
	
	public void createStack(StackUsingArray stack) {
		for (int i = 0; i < 5 ; i++) {
			stack.push(i+10);
		}
	}
}
