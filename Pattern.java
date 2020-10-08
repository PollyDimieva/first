package edu;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rows=6;  
		for(int i=0;i<=rows;i++){  
		for(int j=0;j<i;j++){  
		        System.out.print(" ");  
		}  for(int j=0;j<rows-i;j++) {
			System.out.print("*");
		}
		System.out.println();  
		}  
		}  
		}  