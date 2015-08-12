package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Triangle t = new Triangle(10,10,5,8);
		Rectangle r = new Rectangle(20,20,5,8);
		
		System.out.println(String.format("원의 넓이 : %.1f", c.calcArea()));
		System.out.println(String.format("삼각형의 넓이 : %.1f", t.calcArea()));
		System.out.println(String.format("사각형의 넓이 : %.1f", r.calcArea()));
		
		
	}
}
