public class LotteryPicker{
	public static void main(String[] args){
		//The following are the five random numbers for the lottery.
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		int c = (int)(Math.random()*10);
		int d = (int)(Math.random()*10);
		int e = (int)(Math.random()*10);
		//Display the five lottery numbers.
		System.out.printf("The winning numbers are: %d %d %d %d %d",a,b,c,d,e );
	}
}