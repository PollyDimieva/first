package edu;
import java.util.Scanner;
public class TransposeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

int [][] num = new int[5][3];
int [][]num2 = new int [3][5];
double sum=0.00;
double average=0.00;


System.out.println("Insert the numbers");

for(int i=0;i<5;i++) {
	for(int j=0;j<3;j++) {

		num[i][j]=sc.nextInt();
		
		
	}
}
for(int i=0;i<5;i++) {
	for(int j=0;j<3;j++) {
		num2[j][i]=num[i][j];
	}
}
for(int j=0;j<3;j++) {
	System.out.println();
	for(int i=0;i<5;i++) {
		System.out.print(num2[j][i]+" ");
	}
}System.out.println();

for(int i=0;i<5;i++) {
	sum=0;
	for(int j=0;j<3;j++) {
		sum+=num2[j][i];
		average=sum/3;
	}
 
	
	System.out.print(average+" ");
}
	}
}
