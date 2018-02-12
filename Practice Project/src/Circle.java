
public class Circle {
	private double radius;
	private String color;

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double r) {
		this.radius = r;
	}

	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}

	private double getRadius() {
		return this.radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public String toString() {
		return ("Radius--->" + this.getRadius() + " has an Area of = " + this.getArea() + "\n Fill with color->"
				+ this.getColor());
	}
}
