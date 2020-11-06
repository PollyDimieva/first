package edu;

public class Circle2 {
	
		public double radius=1;
		public Circle2(){
			
		}
		public Circle2(double newRadius){
			radius=newRadius;
		}
		public double getArea(){
			return radius * radius * Math.PI;
		}
		public double getPerimeter(){
			return 2*radius*Math.PI;
		}
		public void setRadius(double newRadius){
			radius=newRadius;
		}

       public double getRadius() {
    	   return radius;
       }


		
}
