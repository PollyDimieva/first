package edu.smg;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers =new int[21];
int range = 100;
for(int i=1;i<=20;i++){
	
	numbers[i]=(int)(Math.random()*range);
			
}for(int i=1;i<=20;i++){
	System.out.print(numbers[i]);
}

}}
