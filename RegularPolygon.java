package edu;

public class RegularPolygon {
	
	
private int n=3;
private double sideLength = 1;
private double x=0;
private double y=0;

public void RegularPolygon(){
	this.setN(n);
	this.setSideLength(sideLength);
	this.x=x;
	this.y=y;
}
public void RegularPolygon(int n,double sideLength,double x,double y) {
	
	x=0;
    y=0;
}
//public RegularPolygon(int n,double sideLength,double x,double y) {
//	
//	
//}
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
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
public double getSideLength() {
	return sideLength;
}
public void setSideLength(double sideLength) {
	this.sideLength = sideLength;
}

 double getPerimeter() {
	 double perimeter = n*sideLength;
	 double perimeter1 = (double)Math.round(perimeter*100)/100;
	return perimeter1;

 }
 
 
 double getArea() {
	 double degrees=180/n;
		double radians=Math.toRadians(degrees);
		double tanValue=Math.tan(radians);
		double cotanValue = 1/tanValue;
		double аrea=n*sideLength*sideLength*cotanValue/4;
		double area1 = (double)Math.round(аrea*100)/100;
		return area1;
 }
//	double perimeter = p.getN()*p.getSideLength();
//	double perimeter1 = (double)Math.round(perimeter*100)/100;
//	return perimeter1;
//	
//}
//public double getArea(RegularPolygon p) {
//	double degrees=180/p.getN();
//	double radians=Math.toRadians(degrees);
//	double tanValue=Math.tan(radians);
//	double cotanValue = 1/tanValue;
//	double аrea=p.getN()*p.getSideLength()*p.getSideLength()*cotanValue/4;
//	double area1 = (double)Math.round(аrea*100)/100;
//	
//	return area1;
//	
//}


}
