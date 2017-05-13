package excercise3;

public class PersonalMortgage extends Mortgage implements MortgageConstants
{
	public PersonalMortgage(double prime_rate, String name, int amount, int term, int no) {
		// TODO Auto-generated constructor stub
		this.customerName = name;
		this.mortgageAmount = amount;
		
		if (term == 3)
		{
			this.mortgageTerm = MEDIUM_TERM;
		}
		
		else if(term == 5)
		{
			this.mortgageTerm = LONG_TERM;
		}
		
		else
		{
			this.mortgageTerm = SHORT_TERM;
		}
		this.mortgageNo = no+1;
		this.interestRate=0.02*prime_rate;
	}
}
