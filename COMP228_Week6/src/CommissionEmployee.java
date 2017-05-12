

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	// Constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		// Validate grossSale number
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		// Validate commissionRate
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// GETTER AND SETTERS
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		// Validate grossSales
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		
		this.commissionRate = commissionRate;
	}
	
	// Calculates earnings
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s $%.2f; %s: %.2f", 
				"Commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
