import java.util.Scanner;

public class Add2{
	public static void main (String[] args) {
		float a, b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = in.nextFloat();
		System.out.println("Enter another number: ");
		b = in.nextFloat();
		System.out.println(a+ " + " + b + " = " + (a+b));
	}
}