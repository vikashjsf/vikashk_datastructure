package com.vikash.datastructure.queue.array;

public class QueueImp implements Queue {
	private int[] stArr;
	private int front;
	private int rear;
	private int length;
	
	
	public QueueImp() {
		stArr = new int[MAX_SIZE];
		front =0;
		rear=-1;
		length=0;
	}
	
	@Override
	public boolean isEmpty() {
		return length==ZERO;
	}
	@Override
	public int getSize() {
		return length;
	}
	@Override
	public boolean isQueueFull() {
		return length == MAX_SIZE-1;
	}
	@Override
	public void enqueue(int data) {
		if(isQueueFull()) {
			System.out.println("Queue is full Insertion is not possible!!");
		}else {
			stArr[++rear]=data;
			length++;
		}
	}
	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty deletion is not possible!!");
		}
		int result=0;
		if(front==rear) {
			result = stArr[front];
			front=0;
			rear=0;
		}else {
			result = stArr[front];
			front++;
		}
		length--;
		return result;
	}
	
	@Override
	public int getFirst() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
			return -1;
		}
		return stArr[front];
	}
	@Override
	public int getLast() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
			return -1;
		}
		return stArr[rear];
	}
	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!!");
			return;
		} else {
			for (int i = 0; i < length; i++) {
				System.out.print(stArr[i] + "-->");
			}
			System.out.println("Null");
		}
	}
}
