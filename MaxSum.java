package edu;
import java.util.Scanner;
public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int [][] num = new int [5][5];
int maxSum = 0 ;
int sum = 0;

System.out.println("Insert the numbers: ");

for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++) {

		num[i][j]=sc.nextInt();
	}
}

//for(int i=0;i<5;i++) {
//	sum=0;
//	for(int j=0;j<5;j++) {
//		sum+=num[i][j];
//	}System.out.println(sum);
//}
for(int i=0;i<5;i++) {
	sum=0;
	for(int j=0;j<5;j++) {
		sum+=num[i][j];
	}	
    if(maxSum<sum) {
    	maxSum=sum;
    }

}System.out.println(maxSum);
	}

}
