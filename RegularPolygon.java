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



}
