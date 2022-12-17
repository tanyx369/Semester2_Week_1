public class Bank
{
	
	int accnum;
	String holder_name;
	double balance;
	
	
	public Bank() {
		
	}
	
	public Bank(int num , String name , double balance) {
		this.accnum = num;
		this.holder_name =name;
		this.balance = balance;
	}
	
	public void Withdraw(double amount) {
		balance -= amount;
		// balance = balance - amount;
	}
	
	public void Deposit(double amount) {
		balance += amount;
		// balance = balance + amount;
	}
	
	public double Show_balance() {
		return balance;
	}
	
	public String toString() {
		return "Account number: " + accnum + "\n" + "Account holder: " + holder_name + "\n" + "Total balance: RM" + Show_balance() + "\n";
	}
    
}
