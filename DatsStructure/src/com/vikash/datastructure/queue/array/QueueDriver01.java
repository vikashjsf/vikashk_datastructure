package com.vikash.datastructure.queue.array;

public class QueueDriver01 {
	public static void main(String[] args) {
		QueueImp queue = new QueueImp();
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		System.out.println("isQueEmpty :"+queue.isEmpty());
		System.out.println("Get Queue Size : "+queue.getSize());
		System.out.println("Is Queue Full : "+queue.isQueueFull());
		System.out.println("Get First : "+queue.getFirst());
		System.out.println("Get Last : "+queue.getLast());
		queue.display();
		System.out.println("After dequeu :"+queue.dequeue());
		System.out.println("After dequeu :"+queue.dequeue());
		System.out.println("After dequeu :"+queue.dequeue());
		System.out.println("Get First : "+queue.getFirst());
		System.out.println("Get Last : "+queue.getLast());
		System.out.println("********Finish**********");
		
	}
}
