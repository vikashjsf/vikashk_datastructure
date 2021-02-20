package com.vikash.datastructure.queue.linkedList;

public class QueueDriver {
	public static void main(String[] args) {
		QueueImp queue = new QueueImp();
		
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		//queue.dequeue();
		//queue.dequeue();
		//queue.dequeue();
		//queue.dequeue();
		System.out.println("isQueEmpty :"+queue.isEmpty());
		System.out.println("Get Queue Size : "+queue.getSize());
		System.out.println("Get First : "+queue.getFirst());
		System.out.println("Get Last : "+queue.getLast());
		
		queue.display();
	}
}
