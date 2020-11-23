package edu;
import java.util.Scanner;

public class ATM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Account[] a =new Account[10];	
		
		for(int i=0;i<10;i++) {
		
			a[i]=new Account(i,100.0);
		}

		while (true) {
			
		
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
		
			if(id>9|| id<0) {
				System.out.println("Please enter a valid ID");
				
		}else {
				//menu on show
				
				System.out.println("Press 1 to check your balance \nPress 2 to withdraw a sum \nPress 3 to deposit a sum \nPress 4 to leave the main menu");
				int pressedNum = sc.nextInt();
				
				
				if(pressedNum==1) {
					System.out.println("Your balance is "+a[id].getBalance());
					
					
				}else if(pressedNum==2) {
					double withdrawedSum = sc.nextDouble();
				a[id].withdraw(withdrawedSum);
					System.out.println("Your balance is now "+a[id].getBalance());
					
					
				}else if(pressedNum == 3) {
					double depositedSum=sc.nextDouble();
					a[id].deposit(depositedSum);
					System.out.println("Your balance is now "+a[id].getBalance());
					
					
				}else if(pressedNum == 4) {
					System.out.println("You have left the main menu.");
					
					
				}else {
					System.out.println("Please enter a number from the menu.");
				}
			}}
		
		
		
		
	}

}
