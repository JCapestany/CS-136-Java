public class ArrayMethodsTester
{
	/**
	Tester class for ArrayMethods.
	*/
	public static void main (String[] args)
	{
		int[] array = {25,4,1,9,16};
		ArrayMethods test = new ArrayMethods(array);
		System.out.println("This is the original array.");
		test.getArray();
		System.out.println("Swapping first and last.");
		test.swapFirstAndLast();
		test.getArray();
		System.out.println("Shifting right.");
		test.shiftRight();
		test.getArray();
		System.out.println("Replacing even with 0's.");
		test.evenToZero();
		test.getArray();
		System.out.println("Replace with largest neighbor.");
		test.replace();
		test.getArray();
	}
}