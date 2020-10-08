package edu.smg;
import java.util.Scanner;
public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
double tuition = 10000;
double prctg = 0.06;
double newTuition =0;
double sum = 0;
for(int i=1;i<=10;i++){
	newTuition = tuition + prctg*tuition;
	tuition = newTuition;
	
}
double NEWtuition = Math.round(newTuition*100)/100.00;
System.out.println(NEWtuition);

for(int j=11;j<=14;j++){
	newTuition = tuition + prctg*tuition;
	sum += newTuition;
}
double SUM = Math.round(sum*100)/100.00;
System.out.println(SUM);
	}

}
