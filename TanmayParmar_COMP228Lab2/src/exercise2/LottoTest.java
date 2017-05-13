package exercise2;

import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Number Between 3 to 27: "));

		for (int i = 0; i < 5; i++) {

			int sum = sumOfNumbers();
			// lottoObj.returnArray();

			if (userInput == sum) {
				JOptionPane.showMessageDialog(null, "You Won");
				break;

			}

			else {
				JOptionPane.showMessageDialog(null, "Computer Won");

			}
		}
	}

	public static int sumOfNumbers() {
		Lotto lottoObj = new Lotto();
		int sumOfNumbers = lottoObj.randomNumbers[0] + lottoObj.randomNumbers[1] + lottoObj.randomNumbers[2];

		return sumOfNumbers;
	}
}