package inheritance;
import java.util.Date;
public class SavingAccount extends Account {

	
public SavingAccount(int accNum,double balance,double annualInterestRate){
	super(accNum,balance,annualInterestRate);	
	}

public void withdraw(double sum) {
	if(sum<getBalance()) {
		double balance = getBalance()-sum;
		setBalance(balance);
		System.out.println(getBalance());
	}else {
		System.out.println("The sum exceeds your current balance.");
	}
}

public String toString() {
	return super.toString();
}



}