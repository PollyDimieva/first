package inheritance;

public class AccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account a1 = new Account(12,6040.8,4.5);
		SavingAccount a2 = new SavingAccount(13,4039.99,4.5);
		CheckingAccount a3  = new CheckingAccount(14,3201.65,4.5);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());

		
	     a2.withdraw(40);
		a3.withdraw(3100);
		
	}

}
