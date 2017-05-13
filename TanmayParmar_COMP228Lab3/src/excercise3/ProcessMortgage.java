package excercise3;

import javax.swing.JOptionPane;

public class ProcessMortgage implements MortgageConstants {

	public static void main(String[] args) {

		double currentInterestRate;
		int mortgageType, mortgageAmount, term;
		String name;

		Mortgage[] mortgages = new Mortgage[3];

		for (int i = 0; i < 3; i++) {

			name = JOptionPane.showInputDialog("Please enter you name");

			currentInterestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter current interest rate\n"));

			mortgageType = Integer.parseInt(
					JOptionPane.showInputDialog("Enter 1 for Business Mortgage or enter 2 for Personal Mortgage"));

			mortgageAmount = Integer.parseInt(JOptionPane.showInputDialog("enter mortgage amount"));

			while (mortgageAmount > MAXIMUM_MORTGAGE_AMOUNT) {
				JOptionPane.showMessageDialog(null, "More than $300000 is not allowed. Please enter Another amount.");
				mortgageAmount = Integer.parseInt(JOptionPane.showInputDialog("enter mortgage amount"));
			}

			term = Integer.parseInt(JOptionPane.showInputDialog("enter mortgage term"));

			if (mortgageType == 1) {
				mortgages[i] = new BusinessMortgage(currentInterestRate, name, mortgageAmount, term, i);
			} else {
				mortgages[i] = new PersonalMortgage(currentInterestRate, name, mortgageAmount, term, i);
			}

		}

		for (Mortgage mort : mortgages) {
			mort.getMortgageInfo();
		}

	}

}
