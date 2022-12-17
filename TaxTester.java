import java.util.*;

public class TaxTester extends Tax
{

	public static void main(String[] args) {
		double[] rates = { 0.15 , 0.275 , 0.305 , 0.355 , 0.391} ;
		
		TaxTester t1 = new TaxTester();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter your annual income (RM): ");
		double income = scan.nextDouble();
		System.out.println("Choose your filing status: \n SINGLE_FILER - 0 \n MARRIED_SEPARATELY_OR_QUALIFYING_WIDOW - 1 \n MARRIED_SEPERATELY - 2 \n HEAD_OF_HOUSEHOLD -3 ");
		int status = scan2.nextInt();
		t1.setIncome(income);
		t1.setStatus(status);
		t1.setRate(rates);
		System.out.println("Status: " + t1.getStatus());
		System.out.printf("Tax payable: RM%.2f" , t1.getTax());
	}
    
}


/*
if (filingStatus == SINGLE_FILER) {
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
}
else if (filingStatus == MARRIED_JOINTLY_OR_QUALIFYING) {
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
}
*/
