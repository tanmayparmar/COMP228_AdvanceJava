package ex3;

public class Account {

	
	
	private String name;
	private double balance;

	
	//Constructor to initialize variables
	
	public Account(String name, double balance) {
		this.name = name;

		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	
	public double getBalance()
	{
		return balance;
	}

	public void setName(String name) {
		// name = "Tanmay";

		this.name = name;
	}

	
	public String getName() {
		return name;

	}
	
	//Method for for the deposit
	
	public void deposit(double depositAmount)
	{
		if(depositAmount> 0)
		{
			balance = balance + depositAmount;
		}
	}
}
