package edu;

public class BMI {
 private String name;
 private int age;
 private double weight;
 
 private double feet;
 private double inches;
	
 
 BMI(){
	 
 }
	
 public BMI(String name, int age, double weight, double feet,
		 double inches) {
	 this.setName(name);
	 this.setAge(age);
	 this.setWeight(weight);
	 this.setFeet(feet);
	 this.setInches(inches);
 }


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


public double getFeet() {
	return feet;
}


public void setFeet(double feet) {
	this.feet = feet;
}


public double getInches() {
	return inches;
}


public void setInches(double inches) {
	this.inches = inches;
}

	
	public double findBMI(BMI a) {
		double h = (a.getFeet()*30.48) + (a.getInches()*2.54);
		double height=h/100;
		double bmi = a.weight/(height*height);
		double BMI =(double)Math.round(bmi*100)/100;
		return BMI;
	}
	
	
}
