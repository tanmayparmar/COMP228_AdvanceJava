package excercise3;

public class MethodOverLoad {

	public static void main(String[] args) {
		
	System.out.printf("Sum of integer 7 and 5 is: %d%n", sum(7,5));
	System.out.printf("Sum of integer 7,5 and 10 is: %d%n", sum(7,5,10)) ;
}

public static int sum(int intValue1,int intValue2)
{
	System.out.printf("%nCalled sum with two int argument: %d and %d%n", intValue1,intValue2);
	return intValue1 + intValue2;
}

public static int sum(int intValue1,int intValue2,int intValue3) {
	System.out.printf("%nCalled sum with three integer argument: %d,%d and %d%n", intValue1,intValue2,intValue3);
	return intValue1 + intValue2 + intValue3;
}

}
