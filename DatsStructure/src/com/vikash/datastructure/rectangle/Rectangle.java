package com.vikash.datastructure.rectangle;

public class Rectangle {
	public Point bottomLeft;
	public Point topRight;
	
	public Rectangle() {
	}
	
	public Rectangle(Point bottomLeft,Point topRight) {
		this.bottomLeft=bottomLeft;
		this.topRight=topRight;
	}
	
	public Point getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(Point bottomLeft) {
		this.bottomLeft = bottomLeft;
	}

	public Point getTopRight() {
		return topRight;
	}

	public void setTopRight(Point topRight) {
		this.topRight = topRight;
	}

	public boolean isOverlapping(Rectangle first, Rectangle second) {
		if (first.bottomLeft.x > second.topRight.x || second.bottomLeft.x > first.topRight.x)
			return false;
		if (first.bottomLeft.y > second.topRight.y || second.bottomLeft.y > first.topRight.y)
			return false;
		return true;
	}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
