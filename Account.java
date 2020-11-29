package edu;
import java.util.Date;

public class Account {
	
private int id=0;
private  double balance=0;
private static double yearInterestRate=0;

private Date dateCreated = new Date();

public Account() {
	
}

public Account(int id, double balance) {
	this.setID(id);
	this.setBalance(balance);
}
public int getID() {
	return id;
}
public void setID(int id) {
	this.id = id;
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

public static double getMonthlyInterestRate() {
	
	double getMothlyInterestRate=yearInterestRate/12;
	return getMothlyInterestRate;
	
	
}


public double getMonthlyInterest() {
	double monthlyInterestRate=yearInterestRate/12;

	double monthlyInterest = balance*monthlyInterestRate/100;
	
	return monthlyInterest;
	
}
public void withdraw(double withdrawSum) {

	balance=balance-withdrawSum;
	
}
public void deposit(double depositSum) {
	
	balance+=depositSum;
	
}




}
