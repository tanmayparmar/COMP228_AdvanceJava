package excercise1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InsusranceTest {

	public static void main(String[] args) {
		int userChoice;
		double userMonthlyInstallement;
		ArrayList<Insurance> insurance = new ArrayList<Insurance>();

		Scanner input = new Scanner(System.in);
		do {
			userChoice = Integer.parseInt(
					JOptionPane.showInputDialog("Please Enter 1 for Life Insurance and 2 for Health Insurance"));

			userMonthlyInstallement = Double.parseDouble(JOptionPane.showInputDialog("Please enter your monthly insurance Amount "));

			if (userChoice == 1) {
				Insurance lifeInsuranceObj = new LifeInsurance("Life Insurance");
				lifeInsuranceObj.costOfInsurance = userMonthlyInstallement;
				insurance.add(lifeInsuranceObj);
			} else if (userChoice == 2) {
				Insurance healthInsuranceObj = new HealthInsurance("Health Insurance");
				healthInsuranceObj.costOfInsurance = userMonthlyInstallement;
				insurance.add(healthInsuranceObj);
			} else {
				JOptionPane.showMessageDialog(null, "Wrong input");
			}

			userChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter 0 to continue or 9 for stop"));
		} while (userChoice == 0);

		

		// polymorphic screen manager
		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).setInsuranceCost(insurance.get(i).costOfInsurance);
			insurance.get(i).displayInfo();
		}

	}
}
