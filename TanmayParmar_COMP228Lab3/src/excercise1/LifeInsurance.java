package excercise1;

import javax.swing.JOptionPane;

public class LifeInsurance extends Insurance{
	
	public LifeInsurance(String typeOfInsurance) {
		super(typeOfInsurance);
	}

	@Override
	public void setInsuranceCost(double costOfInsurance) {
		this.costOfInsurance=costOfInsurance;	
	}

	@Override
	public void displayInfo() {
		JOptionPane.showMessageDialog(null,"Type of Insurance: "+typeOfInsurance);
		JOptionPane.showMessageDialog(null,"Monthly Cost of Insurance: "+costOfInsurance);
	}

}
