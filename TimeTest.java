package edu;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Time time1=new Time();
		
Time time2 = new Time(555550000);

Time time3 = new Time(5,23,55);
System.out.println("Time 1: "+time1.getHours()+ ":"+time1.getMinutes()+":"+time1.getSeconds());		
		
System.out.println("Time 2: "+time2.getHours()+ ":"+time2.getMinutes()+":"+time2.getSeconds());		

System.out.println("Time 3: "+time3.getHours()+ ":"+time3.getMinutes()+":"+time3.getSeconds());		

	
	}

}
