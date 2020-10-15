package edu;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner (System.in);
int range =10;
int []nums = new int[10];
for(int i=0;i<10;i++) {
	System.out.println("Input number "+ (i+1));
	nums[i] = sc.nextInt();
}

for(int i=0;i<10;i++) {
	int randomIndex =(int)(Math.random()*range);
	int swap=nums[i];
	nums[i]= nums[randomIndex];
	nums[randomIndex]=swap;
}
for(int i=0;i<10;i++){
	System.out.print(nums[i]+" ");
}


	}
	
	
	

}
