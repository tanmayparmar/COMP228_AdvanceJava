package ex1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type someName = new Type(..);
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account(); 
		
		myAccount.setName("Parmar");
		
		System.out.printf("Initital Name is: %s%n%n",myAccount.getName());
		
		System.out.println("Please enter the name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
	}

}
