package edu;

public class myPoint {

	
	private double x=0;
	private double y=0;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
}
	
	
	myPoint(){
		
	}
	
	myPoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	
	public double distance(myPoint a) {
		double d = Math.sqrt((a.x-x)*(a.x-x)+(a.y-y)*(a.y-y));
		double distance=(double)Math.round(d*100)/100;
		return distance;
	}
	
	public double distance(double x1, double y1) {
		
		double d= Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		double distance = (double)Math.round(d*100)/100;
		return distance;
	}
	public static double distance(myPoint a, myPoint b) {
		double d= Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
	
		double distance = (double)Math.round(d*100)/100;
		
		return distance;
	}
	
	
}
