package edu;

public class myPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myPoint p1=new myPoint();
myPoint p2 = new myPoint(4.0,2.0);

p1.setX(8.0);
p1.setY(6.0);



		System.out.println(p1.distance(0,0));
		System.out.println(p1.distance( 1, 2));
		System.out.println(p1.distance(p2));
		System.out.println(myPoint.distance(p1, p2));
		
		
		
		
		
		
		
		
		
		
	}

}
