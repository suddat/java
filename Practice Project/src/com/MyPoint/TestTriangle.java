package com.MyPoint;

public class TestTriangle {

	public static void main(String[] args) {
		MyTriangle triangle = new MyTriangle(0, 0, 1, 0, 1, 1);
		System.out.println(triangle);
		System.out.println("Perimeter of a Triangle is = "+triangle.getPerimeter());
		System.out.println(triangle.getType());
		
		MyTriangle triangle1 = new MyTriangle(new MyPoint(0, 0), new MyPoint(2, 0), new MyPoint(3, 3));
		System.out.println(triangle1);
		System.out.println("Perimeter of a Triangle is = "+triangle1.getPerimeter());
		System.out.println(triangle1.getType());
	}

}
