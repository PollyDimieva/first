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
		
		System.out.println(p1.getPerimeter());                
		System.out.println(p1.getArea());
		
		
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());
		
		
	}

}
