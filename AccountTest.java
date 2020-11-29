package edu;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a1=new Account();

a1.setID(1122);
a1.setBalance(20000);
Account.setYearInterestRate(4.5);
a1.withdraw(2500);
a1.deposit(3000);

System.out.println(a1.getBalance());
System.out.println(a1.getMonthlyInterest());
System.out.println(a1.getDateCreated());
	}

}
