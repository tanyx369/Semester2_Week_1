import java.util.*;

public class Transaction  {
	
	
	ArrayList<Double> history ;
	ArrayList<Double> balance;
	
	public Transaction() {
		history = new ArrayList<Double>();
		balance = new ArrayList<Double>();
	}
	
	public void add(double amount) {
		history.add(amount);
	}
		
	public void addBalance(double amount) {
		balance.add(amount);
	}

}
