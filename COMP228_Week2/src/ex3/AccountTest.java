package ex3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account("Tanmay Parmar", 50.00);
		Account account2 = new Account("Messi", -100.00);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());

		Scanner input = new Scanner(System.in);
		
		//account 1
		System.out.print("Enter Amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
		account1.deposit(depositAmount);
		System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());
		
		//account2

		System.out.print("Enter Amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
		account2.deposit(depositAmount);
		System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());
		
	}

}
