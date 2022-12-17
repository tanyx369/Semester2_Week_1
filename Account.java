
public class Account extends Bank {
	
	String name;
	double rate ;
	
	Transaction t1 = new Transaction();
	
	public Account() {
		super();
	}
	
	public Account(int num , String name , double balance , double rate) {
		super(num , name, balance);
		this.rate = rate;
	}
	
	final double old_balance = balance;
	
	public void Withdraw(double amount) {
		balance -= amount;
		t1.add(-amount);
		t1.addBalance(balance);
		// balance = balance - amount;
	}
	
	public void Deposit(double amount) {
		balance += amount;
		t1.add(amount);
		t1.addBalance(balance);
		// balance = balance + amount;
	}

	public void Interest() {
		double amount = balance * (rate/100);
		balance += amount;
		t1.add(amount);
		t1.addBalance(balance);
	}
	
	public void getHistory() {
		
		for (int x = 0 ; x < t1.history.size() ; x++) {
			if(t1.history.get(x) < 0) {
				System.out.println("Credit: " + (-t1.history.get(x)));
				System.out.println("Total balance: " + t1.balance.get(x));
			}
			else if(t1.history.get(x) > 0) {
				System.out.println("Debit: " + t1.history.get(x));
				System.out.println("Total balance: " +  t1.balance.get(x));
			}
		}
	}



}
