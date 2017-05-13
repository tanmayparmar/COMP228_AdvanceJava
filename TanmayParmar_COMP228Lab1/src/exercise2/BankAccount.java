<<<<<<< HEAD
package exercise2;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JOptionPane;

public class BankAccount {

	String accountNumber;
	String fullName;
	double accountBalance = 0.0;

	// Constructor to initialize variables

	public BankAccount(String accountNumber, String fullName, double accountBalance) {
		this.fullName = fullName;
		this.accountNumber = accountNumber;

		if (accountBalance > 0) {
			this.accountBalance = accountBalance;
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	// Default Constructor
	public BankAccount() {

	}

	// Method To display user input in Formatted String

	public void getAccountInfo() {
		String message = String.format("Welcome " + fullName + "." + " Balance for Account Number " + accountNumber
				+ " is $" + accountBalance);
		JOptionPane.showMessageDialog(null, message);
	}
}
=======
package exercise2;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JOptionPane;

public class BankAccount {

	String accountNumber;
	String fullName;
	double accountBalance = 0.0;

	// Constructor to initialize variables

	public BankAccount(String accountNumber, String fullName, double accountBalance) {
		this.fullName = fullName;
		this.accountNumber = accountNumber;

		if (accountBalance > 0) {
			this.accountBalance = accountBalance;
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	// Default Constructor
	public BankAccount() {

	}

	// Method To display user input in Formatted String

	public void getAccountInfo() {
		String message = String.format("Welcome " + fullName + "." + " Balance for Account Number " + accountNumber
				+ " is $" + accountBalance);
		JOptionPane.showMessageDialog(null, message);
	}
}
>>>>>>> origin/master
