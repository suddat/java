package com.MyPoint;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		this.center	= new MyPoint();
		this.radius = 1;
	}
	
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return this.center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double getCircumferance() {
		return 2*Math.PI*this.radius;
	}
	
	public double distance(MyCircle another) {
		System.out.println("in circle distance another =>>"+another);
		return center.distance(another.center);		
	}

	public String toString() {
		return "MyCircle [radius = " + this.radius + ", center"+this.center.toString()+"]";
	}
	
	
}
