public class ArrayMethods
{
	private int[] values;
	
	/**
	Initializes an object with a given int array.
	@param intialValues the int array to be manipulated
	*/
	public ArrayMethods(int[] initialValues)
	{
		values = initialValues;
	}
	
	/**
	Swaps the first and last element.
	*/
	public void swapFirstAndLast()
	{
		//These variables are used as placeholders for the values in the array
		int fph = values[0];
		int lph = values[values.length - 1];
		values[0] = lph;
		values[values.length - 1] = fph;
	}
	
	/**
	Shifts all elements one index to the right and moves the last element to the front.
	*/
	public void shiftRight()
	{
		//Placeholder for the last value as working backwards is easier
		int lph = values[values.length - 1];
		for (int i = values.length - 1; i > 0; i--)
		{
			values[i] = values[i - 1];
		}
		values[0] = lph;
	}
	
	/**
	Replaces all even numbers with a 0.
	*/
	public void evenToZero()
	{
		for (int i = 0; i < values.length; i++)
		{
			if (values[i] % 2 == 0)
			{
				values[i] = 0;
			}
		}
	}
	
	/**
	Replaces a number with largest of its neighbor except for the first and last element.
	*/
	public void replace()
	{
		//Making a copy of the array makes it easier to swap elements
		int[] copy = new int[values.length];
		for (int i = 0; i < copy.length; i++)
		{
			copy[i] = values[i];
		}
		for (int i = 0; i < copy.length; i++)
		{
			//This skips the first and last element
			if (i != 0 ^ i != copy.length - 1)
			{
				continue;
			}
			//This is where the copy array helps in swapping
			int left = copy[i - 1];
			int right = copy[i + 1];
			if (right >= left)
			{
				values[i] = right;
			}
			if (left >= right)
			{
				values[i] = left;
			}
		}
	}
	
	/**
	Prints the values array. This method is to help for testing purposes.
	*/
	public void getArray()
	{
		for (int i = 0; i < values.length; i++)
		{
			System.out.print(values[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
	}
}