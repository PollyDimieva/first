package edu;

public class BMItest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMI bmi1 = new BMI();

bmi1.setName("Polly");
bmi1.setAge(16);
bmi1.setWeight(55);
bmi1.setFeet(5);
bmi1.setInches(8);	
		
		
	System.out.println("The BMI of "+ bmi1.getName()+" who is "+bmi1.getAge()+" years old is "+bmi1.findBMI(bmi1));
		
	
		
		
	}
}