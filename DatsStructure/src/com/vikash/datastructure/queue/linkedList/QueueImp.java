package com.vikash.datastructure.queue.linkedList;

import com.vikash.datastructure.queue.array.Queue;

public class QueueImp implements Queue {
	private Node front;
	private Node rear;
	private int length;
	
	public QueueImp() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}

	@Override
	public boolean isEmpty() {
		return (length==ZERO);
	}

	@Override
	public int getSize() {
		return length;
	}

	@Override
	public boolean isQueueFull() {
		//it will not use here
		return false;
	}

	@Override
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = newNode;
		}else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!! deQueue not possible!!");
			return -1;
		} 
		int result = front.data;
		front = front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
	}

	@Override
	public int getFirst() {
		if(front ==null) {
			return -1;
		}
		return front.data;
	}

	@Override
	public int getLast() {
		if(rear ==null) {
			return -1;
		}
		return rear.data;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
		} else {
			while(front!=null) {
				System.out.print(front.data +"-->");
				front =front.next;
			}
			System.out.print("NULL");
		}
	}
}
