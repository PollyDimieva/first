package edu;
import java.util.Scanner;
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int [][] num =new int[10][10];

System.out.println("Input the numbers from the grid ");
for(int i=0;i<10;i++) {

	for(int j=0;j<10;i++) {
		
		num[i][j]=sc.nextInt();
	}
}

for(int i=0;i<9;i++) {
	for(int j=0;j<9;i++) {
		if(num[i][j]>9) {
			System.out.println("Not a sudoku solution");
		}
	}
}
	}

}
