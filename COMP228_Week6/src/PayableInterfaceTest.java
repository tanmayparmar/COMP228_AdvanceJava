
public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Payable[] payableObjects = new Payable[4];
		
		payableObjects[0] = new Invoice("0123","Seat",2,375.00);
		payableObjects[1] = new Invoice("01234","Tire",4,123.00);
		payableObjects[2]= new SalariedEmployee("Tanmay", "Parmar", "1234534", 1000.00);
		payableObjects[3] =new SalariedEmployee("Bob", "Barker", "123-34534-12", 200.00);
		
		
		//Print info
		
		System.out.println("Invoice and Employees processed polymorphically");
		
		for(Payable currentPayable : payableObjects)
		{
			System.out.printf("%n%s %n%s: $%.2f%n",currentPayable.toString(),
					"Payment Due", currentPayable.getPaymentAmount());
		}
		
	}

}
