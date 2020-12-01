package inheritance;

import java.util.Date;

public class Account {
	
private int accNum=0;                          //
private  double balance=0;                         //
private static double annualInterestRate=4.5;  //
private Date dateCreated = new Date();

public Account(int accNum, double balance,double annualInterestRate) {
	this.setID(accNum);
	this.setBalance(balance);
	this.setAnnualInterestRate(annualInterestRate);
}
public int getAccNum() {
	return accNum;
}
public void setID(int accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public Date getDateCreated() {
	return dateCreated;
}

public static double getAnnualInterestRate() {
	return annualInterestRate;
}

public static void setAnnualInterestRate(double anAnnualInterestRate) {
	annualInterestRate = anAnnualInterestRate;
}



public static double getMonthlyInterestRate() {  //
	
	double mothlyInterestRate=annualInterestRate/12;
	return mothlyInterestRate;
	
	
}


public double getMonthlyInterest() {
	double monthlyInterestRate=annualInterestRate/12;

	double monthlyInterest = balance*monthlyInterestRate/100;
	                                   //
	
	return monthlyInterest;
	
}
public void withdraw(double withdrawSum) {

	balance=balance-withdrawSum;
	
}
public void deposit(double depositSum) {
	
	balance+=depositSum;
	
}

public String toString() {
	return "Account number: "+accNum+" , Balance: "+balance+" , Created on "+dateCreated;
}



}

