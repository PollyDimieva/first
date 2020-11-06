package edu;

public class Student2 {
	private String name;
	private double grades;
	
	public Student2(){
		
	}
	public Student2(String name, double grades) {
		this.setName(name);
		this.setGrades(grades);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrades() {
		return grades;
	}
	public void setGrades(double grades) {
		this.grades = grades;
	}
}
