package com.vikash.datastructure.queue.array;

public interface Queue {
	public static final int MAX_SIZE=10;
	public static final int ZERO=0;
	public abstract boolean isEmpty();
	public abstract int getSize();
	public abstract boolean isQueueFull();
	public abstract void enqueue(int data);
	public abstract int dequeue();
	public abstract int getFirst();
	public abstract int getLast();
	public abstract void display();
}
