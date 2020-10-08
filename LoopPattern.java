package edu;
import java.util.Scanner;
public class LoopPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 15");
		int rows = sc.nextInt();
   
		for(int i = 0 ;i<rows;i++) {
	
	      for(int j=rows-i; j >=1; j--) {
		System.out.print(j+ " ");
		
	      }for(int j=2;j<=rows-i;j++) {
	    System.out.print(j+ " ");
	      }
	      
	      
     System.out.println();
}
	}

}
