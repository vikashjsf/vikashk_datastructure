package com.vikash.datastructure.rectangle;

public class RectangleOverlap {
	public static void main(String[] args) {
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(2, 3);
		Point p4 = new Point(6, 3);
		
		Rectangle first = new Rectangle(p1, p2);
		Rectangle second = new Rectangle(p3, p4);

		Rectangle rec = new Rectangle();
		boolean status = rec.isOverlapping(first, second);
		if (status) {
			System.out.println("Over lapping");
		} else {
			System.out.println("Not Over lapping");
		}

	}
}
/*

https://www.baeldung.com/java-check-if-two-rectangles-overlap

*/