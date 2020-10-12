package edu;
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
  
		System.out.println("Rows=?");
		int x =sc.nextInt();
		System.out.println("Columns=?");
        int y =sc.nextInt();
        
		int [][] num = new int[x][y];
		int [][]num2 = new int [y][x];


		System.out.println("Insert the numbers");

		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {

				num[i][j]=sc.nextInt();
				
				
			}
		}
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				num2[j][i]=num[i][j];
			}
		}
		for(int j=0;j<y;j++) {
			System.out.println();
			for(int i=0;i<x;i++) {
				System.out.print(num2[j][i]+" ");
			}
		}System.out.println();

	
		

	

}}
