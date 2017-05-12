import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroExceptionHandling {
	
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator/denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		boolean countinueLoop =true;
		
		do
		{
			try{
				System.out.println("Please enter a integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.println("Please enter a integer denominator:");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator,denominator);
				System.out.printf("%nResult: %d / %d = %d%n",numerator,denominator,result);
				countinueLoop = false;
			}
			
			catch(ArithmeticException e)
			{
				System.out.printf("%nException: %s%n", e);
				
				System.out.println("Zero is invalid denominator");
			}
			
			catch(InputMismatchException ex)
			{
				System.out.printf("%nException: %s%n", ex);
			}
		}
		
		while(countinueLoop);
	}

}
