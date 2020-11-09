package edu;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fan fan1=new Fan();
Fan fan2 =new Fan();



fan1.speedMax();
fan1.setRadius(10);
fan1.setColor("yellow");

fan1.turnOn();

fan2.speedMedium();
fan2.setRadius(5);
fan2.setColor("blue");

fan2.turnOff();


		toString(fan1);
		toString(fan2);
	}
	public static void toString(Fan fan) {
		if(!fan.isSwitchedOn()) {
			String descriptionOn=fan.getColor()+" "+String.valueOf(fan.getRadius())+" Вентилаторът е изключен.";
			System.out.println(descriptionOn);
		}else {
			String descriptionOff=String.valueOf(fan.getSpeed())+" "+fan.getColor()+" "+String.valueOf(fan.getRadius());
			System.out.println(descriptionOff);
		}
	}
	
}
