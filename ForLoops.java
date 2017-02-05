import java.util.Scanner;

public class ForLoops{
	public static void main(String[] args){
		double balance;
		Scanner in = new Scanner(System.in);
		while (true)
		{
			int year;
			System.out.println("Starting balance: ");
			balance = in.nextLong();
			System.out.println("Year in savings: ");
			year = in.nextInt();
			for (int i = 0; i <= year; i++)
			{
				balance = balance * 1.05;
			}
			System.out.printf("New balance is %.2f .\n" , balance);
		}
	}
}