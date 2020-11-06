package edu;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle2 c1 = new Circle2();

System.out.println("Area of c1 " + c1.getArea()+" perimeter of c1 "+ c1.getPerimeter());
		
Circle2 c2 = new Circle2(4);	
System.out.println("Area of c2 " + c2.getArea()+" perimeter of c2 "+ c2.getPerimeter());



c1.setRadius(10);
System.out.println("Area of c1 " + c1.getArea()+" perimeter of c1 "+ c1.getPerimeter());

	}

}
