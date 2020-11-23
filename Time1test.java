package edu;

public class Time1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
			Time1 time1 = new Time1();
			System.out.println(time1);

			Time1 time2=new Time1(555550000);
			System.out.println(time2.setTime(time2.elapseTime));

			Time1 time3 = new Time1(5, 23, 55);
			System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
			}

			
		}
	

