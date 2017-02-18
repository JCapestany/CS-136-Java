public class HW4Q2
{
	public static void main(String[] args)
	{
		//Initializes an array with 10 random integers from 1 - 100
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)
		{
			array[i] = (int )(Math.random() * 100 + 1);
		}
		
		//Prints every integer in an even index
		for (int i = 0; i < 10; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(array[i]+" ");
			}
		}
		System.out.print("\n");
		
		//Prints every even number in the array
		for (int i = 0; i < 10; i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.print(array[i]+" ");
			}
		}
		System.out.print("\n");
		
		//Prints the array in reverse order
		for (int i = 9; i > -1; i--)
		{
				System.out.print(array[i]+" ");
		}
		System.out.print("\n");
		
		//Prints the first and last element in the array
		for (int i = 0; i < 10; i++)
		{
			if (i == 0)
			{
				System.out.print(array[i]+" ");
			}
			if (i == array.length - 1)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
}