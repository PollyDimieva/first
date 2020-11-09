package edu;

public class Fan {

	final int SLOW =1;
	final int MEDIUM=2;
	final int FAST=3;
	
	private int speed=SLOW;
	private boolean switchedOn=false;
	private double radius=5;
	private String color = "blue";
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isSwitchedOn() {
		return switchedOn;
	}
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void turnOn() {
		switchedOn=true;
	}
	
	public void speedMax() {
		speed=FAST;
	}
	public void speedMedium() {
		speed=MEDIUM;
	}
	
	public void speedSlow() {
		speed=SLOW;
	}
	
	
	public void turnOff() {
		switchedOn=false;
	}
	
	
	
}



