public class SavingAccount extends Bank
{
	
	double interest_rate;
	
	public SavingAccount(int num , String name, double balance, double rate) {
    	super(num , name, balance);
    	this.interest_rate = rate;
    	
    }
	
	public void add_interest() {
		double interest = super.balance * interest_rate ;
		Deposit(interest);
		// balance += interest;
		// getBalance() * rate/100
		
	}
    
	 public String toString() {
	    	return "Saving Account\n" + "--------------\n" + super.toString() ;
	    }
	    
	
}
