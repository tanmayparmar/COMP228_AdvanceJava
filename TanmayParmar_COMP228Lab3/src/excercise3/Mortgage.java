package excercise3;

import javax.swing.JOptionPane;

public abstract class Mortgage implements MortgageConstants {
	int mortgageNo;
	String customerName;
	int mortgageAmount;
	double interestRate, totalAmount;
	int mortgageTerm;

	//calculating total amount
	
	public double calculator() {

		double interest = mortgageAmount * interestRate;

		totalAmount = mortgageAmount + interest;
		return totalAmount;
	}

	
	//getting mortgage information
	public void getMortgageInfo() {
		JOptionPane.showMessageDialog(null,
				String.format( 
						"Bank name: %s %nCustomer Name: %s %nMortgage Number: %d %nMortgage Amount: %d %nInterest Rate: %.2f %nMortgage Term: %d %nTotal Amount: %.2f",BANK_NAME,
						customerName, mortgageNo, mortgageAmount, interestRate, mortgageTerm, calculator()));

	}
}
