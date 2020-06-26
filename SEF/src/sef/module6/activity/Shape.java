package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape () {
	}
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	
	public abstract double calculateArea();
	public abstract void setArea(double area);
	
	public abstract double calculatePerimeter();
	public abstract void setPerimeter(double perimeter);
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}
