package edu;

public class Fan {

	final int slow =1;
	final int medium=2;
	final int fast=3;
	
	private int speed=slow;
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
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
}



