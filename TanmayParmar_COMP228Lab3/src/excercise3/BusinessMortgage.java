package excercise3;

public class BusinessMortgage extends Mortgage{
	public BusinessMortgage(double prime_rate, String name, int amount, int term, int no) {
		// TODO Auto-generated constructor stub
		this.customerName = name;
		this.mortgageAmount = amount;
		if (term !=3 || term !=5){
			this.mortgageTerm = SHORT_TERM;
		}
		//this.mortgage_term = term;
		this.mortgageNo = no+1;
		this.interestRate=0.01*prime_rate;
	}
}
