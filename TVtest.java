package edu;

public class TVtest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	TV tv1 =new TV();
	
	System.out.println("Channel: " + tv1.channel +"\n" + "Volume: " +  tv1.volume +"\n" + "on: "+tv1.turnedOn);
	tv1.switchOn();
	tv1.setChannel(5);
	tv1.setVolume(7);
    tv1.channelUp();
	tv1.channelDown();
	tv1.volumeUp();
	tv1.volumeDown();
	
	System.out.println("Channel: " + tv1.channel +"\n" + "Volume: " +  tv1.volume +"\n" + "on: "+tv1.turnedOn);
}
}