package com.MyPoint;

public class TestMain {

	public static void main(String[] args) {
		/*MyPoint[] pointArr = new MyPoint[10];
		
		for (int i = 0; i < pointArr.length; i++) {
			pointArr[i] = new MyPoint(i, i);
		}
		for (MyPoint xy : pointArr) {
			System.out.println(xy);
		}*/
		
		/*MyPoint p1 = new MyPoint();  // Test constructor
		System.out.println(p1);      // Test toString()
		p1.setX(8);   // Test setters
		p1.setY(6);
		//System.out.println(p1);      // Test toString()
		System.out.println("x is: " + p1.getX());  // Test getters
		System.out.println("y is: " + p1.getY());
		p1.setXY(3, 0);   // Test setXY()
		
		System.out.println(p1.getXY()[0]);  // Test getXY()
		System.out.println(p1.getXY()[1]);
		
		//System.out.println("Herer===>"+p1);

		MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
		System.out.println(p2);
		// Testing the overloaded methods distance()
		System.out.println(p1.distance(p2));    // which version?
		System.out.println(p2.distance(p1));    // which version?
		System.out.println(p1.distance(5, 6));  // which version?
		System.out.println(p1.distance());      // which version?
*/
		MyCircle circle = new MyCircle(2, 4, 3);
		System.out.println(circle);
		System.out.println(circle.getCenter());
		System.out.println(circle.getRadius());
		circle.setCenterX(1);
		System.out.println(circle.getCenterX());
		circle.setCenterY(2);
		System.out.println(circle.getCenterY());
		circle.setRadius(4);
		System.out.println(circle.getRadius());
		System.out.println(circle);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumferance());
		MyCircle circle1 = new MyCircle(4, 6, 5);
		System.out.println(circle.distance(circle1));
	}

}
