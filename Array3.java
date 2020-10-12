package edu;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numbers []=new int[10];
		for(int i=0;i<10;i++) {
	System.out.println("Insert number "+ (i+1));
	numbers[i]=sc.nextInt();
	}

		int swap = numbers[0];
	
		for(int i=1;i<10;i++) {
			numbers[i-1]=numbers[i];
		}
		numbers[9]=swap;
		for(int i=0;i<10;i++) {
			System.out.println(numbers[i]);
		}
}
}