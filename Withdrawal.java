public class Withdrawal{
	public static void main(String[] args){
		double balance = 10000;
		int month = 0;
		while (balance > 0)
		{
			month = month + 1;
			balance = balance * 1.005 - 500;
		}
		int year = month / 12;
		int newmonth = month % 12;
		System.out.printf("The account is exhausted after %d year(s) and %d month(s).\n", year, newmonth);
	}
}