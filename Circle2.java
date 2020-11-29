package edu;

public class Circle2 {
	 private double radius;
	 
	 
	 public Circle2(){
		 radius = 1;
	 }
		
	public Circle2(double newRadius){
		radius = newRadius;
	}
		
		public double getArea() {
		
			double a = Math.PI*radius*radius;
			double area = (double)Math.round(a*100)/100;
			return area;
		}
		
		public double getPerimeter() {
			double p = 2*Math.PI*radius;
			double perimeter = (double)Math.round(p*100)/100;
			return perimeter;
		}
		
		public void setRadius(double newRadius) {
			radius = newRadius;
		}
		
		public double getRadius() {
			return radius;
		}
		
}
