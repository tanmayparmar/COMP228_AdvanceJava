import java.util.Scanner;

public class DivideByZeroNOExceptionHandling {

	public static int quotient(int numerator, int denominator) {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter an integer Numerator");

		int numerator = scanner.nextInt();

		System.out.println("PLease enter an interger denominator");

		int denominator = scanner.nextInt();
		
		int result = quotient(numerator,denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator,result);

	}

}
