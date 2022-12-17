public class CurrentAccount extends Bank
{
	
	double processing_fee ;
	
    public CurrentAccount(int num , String name, double balance, double fee) {
    	super(num , name, balance);
    	this.processing_fee = fee;
    }
    
    public void processing_charge() {
    	Withdraw(processing_fee);
    }
    
    public String toString() {
    	return "Current Account\n" + "--------------\n" + super.toString() ;
    }
    
}
