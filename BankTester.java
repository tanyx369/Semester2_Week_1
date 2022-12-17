import java.util.*;

public class BankTester
{
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(2332 , "Jack" , 1000 , 0.10);
		s1.add_interest();
		System.out.println(s1);
		
		CurrentAccount c1 = new CurrentAccount(3212 , "John", 3000 , 300);
		c1.processing_charge();
		System.out.println(c1);
		
		Account a1 = new Account(12312 , "Peter" , 30000 , 0.10);
		a1.Interest();
		a1.Deposit(30);
		a1.Withdraw(40);
		//System.out.println(a1.Show_balance());
		a1.getHistory();
	}
    
}
