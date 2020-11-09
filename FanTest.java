package edu;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fan fan1=new Fan();
		

fan1.turnOn();
fan1.speedUp();


		toString(fan1);
		
	}
	public static void toString(Fan fan1) {
		if(!fan1.isSwitchedOn()) {
			String descriptionOff=fan1.getColor()+" "+String.valueOf(fan1.getRadius())+" Вентилаторът е изключен.";
			System.out.println(descriptionOff);
		}else {
			String descriptionOn=String.valueOf(fan1.getSpeed())+" "+fan1.getColor()+" "+String.valueOf(fan1.getRadius());
			System.out.println(descriptionOn);
		}
	}
	
}
