package edu;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RegularPolygon p1 = new RegularPolygon();
RegularPolygon p2 = new RegularPolygon();
		
		p1.setN(6);
		p1.setSideLength(4);
		
		p2.setN(10);
		p2.setSideLength(4);
		p2.setX(5.6);
		p2.setY(7.8);
		
		getPerimeter(p1);
		getArea(p1);
		
		
		getPerimeter(p2);
		getArea(p2);
		
		
	}
	public static void getPerimeter(RegularPolygon p) {
		double perimeter = p.getN()*p.getSideLength();
		System.out.println("P = "+perimeter);
		
	}
	public static void getArea(RegularPolygon p) {
		double degrees=180/p.getN();
		double radians=Math.toRadians(degrees);
		double tanValue=Math.tan(radians);
		double cotanValue = 1/tanValue;
		double аrea=p.getN()*p.getSideLength()*p.getSideLength()*cotanValue/4;
		
		
		System.out.println("S = "+аrea);
		
	}
}
