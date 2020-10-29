package edu;
import java.lang.*;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);		
		
System.out.println("n=?");

double n=sc.nextDouble();	

boolean isPrime = true;
double maxDivider = Math.sqrt(n);
for(int i = 2; i <= maxDivider; i++){
  if( n % i == 0){
    isPrime = false;
    break;
  }
}
if(isPrime){
  System.out.println("Prime");
}else{
  System.out.println("Not prime");
}
}	
	}



