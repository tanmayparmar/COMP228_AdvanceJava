package exercise2;

import java.util.Arrays;


public class Lotto {

	int[] randomNumbers = new int[3];

	Lotto() {

		randomNumbers[0] = (int) (Math.random() * 9 + 1);
		randomNumbers[1] = (int) (Math.random() * 9 + 1);
		randomNumbers[2] = (int) (Math.random() * 9 + 1);

	}// end for loop

	public int[] returnArray() {
		int[] copyRandomNumbers = new int[3];

		System.arraycopy(randomNumbers, 0, copyRandomNumbers, 0, randomNumbers.length);

		return copyRandomNumbers;

	}

}