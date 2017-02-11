public class Interest{
	public static void main(String[] args){
		double balance = 1000;
		for (int i = 1; i <= 3; i++)
		{
			balance = balance * 1.05;
			System.out.printf("New balance is %.2f\n" , balance);
		}
	}
}