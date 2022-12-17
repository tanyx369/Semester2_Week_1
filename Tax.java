public class Tax
{
	
	int filingStatus ;
	
	static final int SINGLE_FILER = 0;
    static final int MARRIED_JOINTLY_OR_QUALIFYING = 1;
    static final int MARRIED_SEPERATELY = 2;
    static final int HEAD_OF_HOUSEHOLD = 3;
	
	//double[] rates = new double[] {};
	double[] rates ;
	double rate;
	
	double taxableincome;
	
	public Tax() {
		
	}
	
	public Tax(int status , double[] rate , double taxableIncome) {
		this.filingStatus = status;
		this.rates = rate ;
		this.taxableincome = taxableIncome;
		
	}
	
	// Methods
	
	
	public void setIncome(double income) {
		taxableincome = income;
	}
	
	public void setStatus(int i) {
		filingStatus = i;
	}
	
	public void setRate(double[] rates) {
		switch(filingStatus) {
		
		case SINGLE_FILER:
			if(taxableincome <= 27050 ) {
				rate = rates[0];
			}
			else if (27051 <= taxableincome && taxableincome <= 65550 ) {
				rate = rates[1];
			}
			else if (65551 <= taxableincome && taxableincome <= 136750) {
				rate = rates[2];
			}
			else if (136751 <= taxableincome && taxableincome <= 297350) {
				rate = rates[3];
			}
			else {
				rate = rates[4];
			}
		break;
		
		case MARRIED_JOINTLY_OR_QUALIFYING:
			if(taxableincome <= 45200 ) {
				rate = rates[0];
			}
			else if (45201 <= taxableincome && taxableincome <= 109250 ) {
				rate = rates[1];
			}
			else if (109251 <= taxableincome && taxableincome <= 166500) {
				rate = rates[2];
			}
			else if (166501 <= taxableincome && taxableincome <= 297350) {
				rate = rates[3];
			}
			else {
				rate = rates[4];
			}
		break;
		
		case MARRIED_SEPERATELY:
			if(taxableincome <= 22600 ) {
				rate = rates[0];
			}
			else if (22601 <= taxableincome && taxableincome <= 54625 ) {
				rate = rates[1];
			}
			else if (54626 <= taxableincome && taxableincome <= 83250) {
				rate = rates[2];
			}
			else if (83251 <= taxableincome && taxableincome <= 148675) {
				rate = rates[3];
			}
			else {
				rate = rates[4];
			}
		break;
		
		
		case HEAD_OF_HOUSEHOLD:
			if(taxableincome <= 36250 ) {
				rate = rates[0];
			}
			else if (36251 <= taxableincome && taxableincome <= 93650 ) {
				rate = rates[1];
			}
			else if (93651 <= taxableincome && taxableincome <= 151650 ) {
				rate = rates[2];
			}
			else if (151651 <= taxableincome && taxableincome <= 297350) {
				rate = rates[3];
			}
			else {
				rate = rates[4];
			}
		break;
		
		}
		
	}
	
	public double getRate() {
		return rate;
	}
	
	public String getStatus() {
		
		String status = "" ;
		
		switch(filingStatus) {
		
		case SINGLE_FILER:
			status = "SINGLE_FILER";
		break;
		
		case MARRIED_JOINTLY_OR_QUALIFYING:
			status = "MARRIED_JOINTLY_OR_QUALIFYING";
		break;
		
		case MARRIED_SEPERATELY:
			status = "MARRIED_SEPERATELY";
		break;
		
		case HEAD_OF_HOUSEHOLD:
			status = "HEAD_OF_HOUSEHOLD";
		break;

		}
		
		return status;
	}
	
	public double getIncome() {
		return taxableincome;
	}
	
	public double getTax() {
		double tax = taxableincome * rate ;
		return tax;
	}
    
	
}
