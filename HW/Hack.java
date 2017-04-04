import java.util.*;

public class Hack
{
	public static void main (String[] args) throws InterruptedException
	{
		System.out.print("Hacking ");
		for (String s : args)
		{
			System.out.print(s + " ");
		}
		Thread.sleep(1000);
		System.out.print("\n.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);;
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(" succesfully hacked ");
		for (String s : args)
		{
			System.out.print(s + " ");
		}
		Thread.sleep(3000);
		Character[] m = {'!','@','#','$','%','^','&','*','|','A','a','B','b','C','C','c','D','d','E','e','F','f','G','g',
						 'H','h','I','i','J','j','K','k','L','l','M','m','N','n','O','o','P','p','Q','q','R','r','S','s',
						 'T','t','U','u','V','v','W','w','X','x','Y','y','Z','z','0','1','2','3','4','5','6','7','8','9'};
		while (true)
		{
			Random rn = new Random();
			int r = rn.nextInt(71);
			System.out.print(m[r]);
		}
	}
}