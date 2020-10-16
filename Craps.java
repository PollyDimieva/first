package edu.smg;
import java.util.Scanner;
public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
      int range=6;
    int x =(int)((Math.random()*range)+1);
    int y = (int)((Math.random()*range)+1);
    System.out.println(x+" + "+y+" = "+(x+y));
   first(x,y);
    
  
	}


public static void first(int num1, int num2){
	
	int sum=num1+num2;
	int newSum=0;
	int range=6;
	
	if(sum==7 || sum==11){
		System.out.println("You win");
		
	}else if(sum==2|| sum==3 || sum==12){
		System.out.println("You lose");
	}else{
		
do{
	int num3 = (int)((Math.random()*range)+1);
	int num4 = (int)((Math.random()*range)+1);
	newSum = num3+num4;
	System.out.println(num3 + " + " + num4 + " = " + newSum);
	
	if(newSum==sum){
		System.out.println("You win");
		break;
	}else if(newSum == 7){
		System.out.println("You lose");
		break;
	}

		}
while(newSum!=7 && newSum != sum);
	}
	
}

}