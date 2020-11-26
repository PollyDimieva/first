package edu;

public class Time {

	private int hours=0;
	private int minutes=0;
	private int seconds=0;
//	private long elapseTime;

	//milisec=0.001*sec
	
	Time(){
		long currentTime = System.currentTimeMillis();
		
		
		setTime(currentTime);
	}
	
	
	 Time(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public Time(long elapseTime) {
		setTime(elapseTime);
		}

	
	
	public  void setTime (long elapseTime) {
		
        long inSeconds = elapseTime/1000;
        this.seconds = (int)(inSeconds%60);
        long inMinutes = inSeconds/60;
        this.minutes=(int)(inMinutes%60);
        long inHours = inMinutes/60;
        this.hours = (int)(inHours%24);
		//sec = inSeconds%60;
		//hour = inMinutes%24;
		//min = inMinutes%60;
		//return hour + ":" + min + ":" +sec;
	 
//     hour=(int)elapseTime/3600000;
//     min=(int)elapseTime/60000;
//     sec=(int)elapseTime/1000;
//     System.out.println(hour+":"+ min +":"+ sec);
	}


	public int getHours() {
		return hours;
	}


	public int getMinutes() {
		return minutes;
	}


	public int getSeconds() {
		return seconds;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
