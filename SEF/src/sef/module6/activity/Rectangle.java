package sef.module6.activity;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

//default constructor
	public Rectangle() {
	}
//parameterized constructor	
	public Rectangle(double length, double breadth, double area, double perimeter) {	
	}
	// getter for double length
	public double getLength() {
		return length;
	}
	
	// setter for double length
	public void setLength(double length) {
		this.length = length;
	}
	// getter for double breadth
	public double getBreadth() {
		return breadth;
	}
	
	// setter for double breadth
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double calculateArea() {
		return length * breadth;
	}

	public void setArea(double area) {
	
	}

	public double calculatePerimeter() {
		return (length + breadth) *2 ;
	}

	public void setPerimeter(double perimeter) {
		
	}

}



