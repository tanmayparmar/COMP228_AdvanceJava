
public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,2,3,4,5};
		
		System.out.printf("Effect of passing reference to entire array:%n"
				+"The values of the original array are: %n");
		
		for(int val:myArray)
		{
			System.out.printf("%d",val);
		}

		modifyArray(myArray);
		System.out.printf("%n%nThe values of the modified array are:%n");
		
		for(int val:myArray)
		{
			System.out.printf("%d",val);
		}
		
		
		//print element at index 3
		System.out.printf("%n%nEffects of passing array element value:%n"
				+ "array[3] before modifyElement: %d%n", myArray[3]);
		
		
		//passing primitive type to array
		modifyElement(myArray[3]);
		for(int val:myArray)
		{
			System.out.printf("%d",val);
		}
		
	}

	public static void modifyArray(int array2[])
	{
		for(int val: array2)
		{
			val *= 2;
		}

	for (int counter =0;counter<array2.length;counter++)
	{
		array2[counter] *= 2;
	}
	}
	
	public static void modifyElement(int element)
	{
		element *=2;
		System.out.printf("Value of element in modifyElement: %d%n",element);
	}
}
