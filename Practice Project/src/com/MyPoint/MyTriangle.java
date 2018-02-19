package com.MyPoint;

public class MyTriangle {
	private MyPoint ver1, ver2, ver3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.ver1 = new MyPoint(x1, y1);
		this.ver2 = new MyPoint(x2, y2);
		this.ver3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.ver1 = v1;
		this.ver2 = v2;
		this.ver3 = v3;
	}
	
	public double getPerimeter() {
		double p1p2 = this.ver1.distance(this.ver2);
		double p2p3 = this.ver2.distance(this.ver3);
		double p3p1 = this.ver3.distance(this.ver1);		
		return (p1p2+p2p3+p3p1);
	}
	
	public String getType() {
		double p1p2 = this.ver1.distance(this.ver2);
		double p2p3 = this.ver2.distance(this.ver3);
		double p3p1 = this.ver3.distance(this.ver1);
		if (p1p2 == p2p3 && p2p3 == p3p1) {
			return "Equilateral Triangle";
		}else if(p1p2 == p2p3 || p2p3 == p3p1 || p3p1 == p1p2) {
			return "Isosceles Triangle";
		}else {
			return "Scalene Triangle";
		}
	}

	public String toString() {
		return "MyTriangle [vertice1=" + this.ver1 + ", vertice2=" + this.ver2 + ", vertice3=" + this.ver3 + "]";
	}
	
	
}
