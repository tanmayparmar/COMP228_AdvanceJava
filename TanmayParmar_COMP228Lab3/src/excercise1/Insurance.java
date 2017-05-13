package excercise1;

public abstract class Insurance {
	
	String typeOfInsurance;
	double costOfInsurance;
	
	public Insurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
	}
	
	public String getInsuranceType() {
		return typeOfInsurance;
	}
	
	public double getInsuranceCost() {
		return costOfInsurance;
	}
	
	public abstract void setInsuranceCost(double costOfInsurance);
	
	public abstract void displayInfo();
	
}
