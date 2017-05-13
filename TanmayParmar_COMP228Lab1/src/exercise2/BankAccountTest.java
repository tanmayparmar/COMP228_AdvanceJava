<<<<<<< HEAD
package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;

		double amount = 0.0;

		// BankAccount class object

		BankAccount bankAccountObj = new BankAccount();

		// Ask user to initialize data and saving into variables

		bankAccountObj.setAccountNumber(JOptionPane.showInputDialog("Please Enter Your Account Number"));
		bankAccountObj.setFullName(JOptionPane.showInputDialog("Please Enter your Full Name"));

		userInput = Integer.parseInt(JOptionPane.showInputDialog("Please Enter 1 For Deposit and 2 for Withdraw"));

		// use user choice for performing operation
		switch (userInput) {
		case 1:

			amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount for Deposit"));

			if (amount <= 0)
				JOptionPane.showMessageDialog(null, "Can't deposit this amount.");
			else {
				bankAccountObj.accountBalance += amount;

			}
			break;

		case 2:

			amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount for withdraw"));

			if (amount <= 0) {
				JOptionPane.showMessageDialog(null,
						"Sorry " + bankAccountObj.getFullName() + " You Can not Withdraw this amount.");

			} else {
				bankAccountObj.accountBalance -= amount;
			}
			break;

		default:
			System.out.println("Wrong Input");
			break;
		}

		// Calling getAccountInfo Method
		bankAccountObj.getAccountInfo();

	}

}
=======
package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;

		double amount = 0.0;

		// BankAccount class object

		BankAccount bankAccountObj = new BankAccount();

		// Ask user to initialize data and saving into variables

		bankAccountObj.setAccountNumber(JOptionPane.showInputDialog("Please Enter Your Account Number"));
		bankAccountObj.setFullName(JOptionPane.showInputDialog("Please Enter your Full Name"));

		userInput = Integer.parseInt(JOptionPane.showInputDialog("Please Enter 1 For Deposit and 2 for Withdraw"));

		// use user choice for performing operation
		switch (userInput) {
		case 1:

			amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount for Deposit"));

			if (amount <= 0)
				JOptionPane.showMessageDialog(null, "Can't deposit this amount.");
			else {
				bankAccountObj.accountBalance += amount;

			}
			break;

		case 2:

			amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount for withdraw"));

			if (amount <= 0) {
				JOptionPane.showMessageDialog(null,
						"Sorry " + bankAccountObj.getFullName() + " You Can not Withdraw this amount.");

			} else {
				bankAccountObj.accountBalance -= amount;
			}
			break;

		default:
			System.out.println("Wrong Input");
			break;
		}

		// Calling getAccountInfo Method
		bankAccountObj.getAccountInfo();

	}

}
>>>>>>> origin/master
