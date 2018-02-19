package com.MyPoint;

public class MyPoint {
	private int x, y;
	private int[] xy= new int[2];
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	
	public int[] getXY() {
		return this.xy;  
	}
	
	public void setXY(int x, int y) {
		this.xy[0] = x;
		this.xy[1] = y;
	}
	
	public double distance(int x, int y) {
		int xDiff = x;
		int yDiff = y;		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint point) {
		int xDiff = this.x - point.x;
		int yDiff = this.y - point.y;
		/*System.out.println("thisX ->"+ this.x+ "- pointX===>"+point.x);
		System.out.println("thisY ->"+ this.y+ " pointY===>"+point.y);*/
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance() {
		return Math.sqrt(this.x*this.x+ this.y*this.y); 
	}
	@Override
	public String toString() {
		return "(x=" + this.x + ", y=" + this.y +")";
	}	
	
}
