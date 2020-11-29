package edu;

public class TV {


public int channel;
public int volume;
public boolean turnedOn;
		
		
		
		public TV () {
			channel = 1;
			volume=4;
			turnedOn=false;
		}
		
	public void switchOn() {
		turnedOn=true;
	}
	
	public void switchOff() {
		turnedOn=false;
	}
	
   public void setChannel(int newChannel) {
	   if(newChannel>120 || newChannel < 1 || !turnedOn) {
		   return;
	   }
	   channel=newChannel;
	   
   }
	public void setVolume(int newVolume) {
		if(newVolume<1 || newVolume>7 || !turnedOn) {
			return;
			}
		volume = newVolume;
		
		}
	
	
	public void channelUp() {
		if(channel==120|| !turnedOn) {
			return;
		}
		channel++;
	}
	
	
	public void channelDown() {
		if(channel==1||!turnedOn) {
			return;
		}
		channel--;
	}
	
	public void volumeUp() {
		if(volume==7|| !turnedOn) {
			return;
		}
		volume++;
	}
	
	
	public void volumeDown() {
		if(volume==1||!turnedOn) {
			return;
		}
		volume--;
	}
	
	
	
	
	
	
}
