package inheritance;
import java.util.Date;
public class CheckingAccount extends Account {

private double limit = 200;	
	
public CheckingAccount(int accNum,double balance, double annualInterestRate) {
	super(accNum,balance,annualInterestRate);
	
}

public double getLimit() {
	return limit;
}

public void setLimit(double limit) {
	this.limit = limit;
}
	
public void withdraw (double sum) {

	if( getBalance() - sum > limit) {
	double	balance = getBalance()-sum;
		setBalance(balance);
		System.out.println(getBalance());
	}else {
		System.out.println("The sum exceeds the overdraft limit.");
	}
	
}

public String toString() {
	return super.toString();
}
	
}
