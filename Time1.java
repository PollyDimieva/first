package edu;

public class Time1 {
	private long hour, minute, second;
	public long elapseTime;

	public Time1() {
	System.currentTimeMillis ();

	}

	public Time1(int hour, int minute ,int second) {
	this.hour=hour;
	this.minute=minute;
	this.second= second;

	}
	public Time1(long elapseTime) {
	this.elapseTime=elapseTime;
	}

	public long getSecond() {
	return second;
	}

	public void setSecond(int second) {
	this.second = second;
	}

	public long getMinute() {
	return minute;
	}

	public void setMinute(int minute) {
	this.minute = minute;
	}
	public long getHour() {
	return hour;
	}

	public void setHour(int hour) {
	this.hour = hour;
	}

	public String setTime(long elapseTime) {
	this.elapseTime=elapseTime;
	long inSeconds = elapseTime/1000;
	long inMinutes = inSeconds/60;
	second = inSeconds%60;
	hour = inMinutes%24;
	minute = inMinutes%60;
	return hour + ":" + minute + ":" +second;
	}
}
