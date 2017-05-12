
public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Square of integer 7 is: %d%n", squre(7));
		System.out.printf("Square of double 7.5 is: %f%n", square(7.5) );
	}
	
	public static int squre(int intValue)
	{
		System.out.printf("%nCalled square with in argument: %d%n", intValue);
		return intValue * intValue;
	}
	
	public static double square(double doubleValue) {
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}

}
