package com.vikash.datastructure.stack.array;

public interface Stack {
	public abstract boolean isEmpty();
	public abstract int getLength();
	public abstract void push(int data);
	public abstract int pop();
	public abstract int peek();
	public abstract void display();
	public abstract boolean isStackFull();
}
