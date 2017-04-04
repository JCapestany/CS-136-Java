public class CoinTester
{
	/**
	Tester class for implenting the Comparable interface on Coin.
	*/
	public static void main (String[] args)
	{
		Coin quarter = new Coin(.25,"Quarter");
		Coin penny = new Coin(.01,"Penny");
		Coin dime = new Coin(.1,"Dime");
		Coin nickel = new Coin(.05, "Nickel");
		Coin[] array = {penny,dime,penny,quarter,dime,nickel,nickel};
		
		System.out.print("An array contains ");
		for (Coin q : array)
		{
			System.out.print("a " + q.getName() + ", ");
		}
		System.out.print("in that order.\n");
		System.out.println("The index of the largest coin is:");
		System.out.println(largestCoin(array));
	}
	
	/**
	Compares an array of coins and returns the index of the largest coin.
	@param array an array of Coin objects
	@return index the index of the coin with the largest value
	*/
	public static int largestCoin(Coin[] array)
	{
		int index = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].compareTo(array[index]) == 1)
			{
				index = i;
			}
		}
		return index;
	}
}