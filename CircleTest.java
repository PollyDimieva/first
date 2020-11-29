package edu;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c1 = new Circle();

System.out.println("Area of c1 " + c1.getArea()+" perimeter of c1 "+ c1.getPerimeter());
		
Circle c2 = new Circle(4.8);	
System.out.println("Area of c2 " + c2.getArea()+" perimeter of c2 "+ c2.getPerimeter());



c1.setRadius(4.8);
System.out.println("Area of c1 " + c1.getArea()+" perimeter of c1 "+ c1.getPerimeter());

	}

}
