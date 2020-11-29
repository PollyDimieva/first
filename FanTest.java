package edu;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fan fan1=new Fan();
Fan fan2 =new Fan();



fan1.speedMax();
fan1.setRadius(10);
fan1.setColor("yellow");
fan1.setSwitchedOn(true);

fan2.speedMedium();
fan2.setSwitchedOn(false);

fan2.turnOff();

System.out.println(fan1.toString());
System.out.println(fan2.toString());
	}
	
	
}
