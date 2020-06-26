package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Rectangle Square = new Rectangle();
		Square.setLength(5);
		Square.setBreadth(5);
		Square.setColor("Red");
		
		Rectangle Rectangle1 = new Rectangle();
		Rectangle1.setLength(5);
		Rectangle1.setBreadth(6);
		Rectangle1.setColor("Blue");

	System.out.println (Square.getColor() +" Square area is "+ Square.calculateArea()+", perimeter is " + Square.calculatePerimeter());
	System.out.println (Rectangle1.getColor() +" Rectangle area is "+ Rectangle1.calculateArea()+", perimeter is " + Rectangle1.calculatePerimeter());
}
}