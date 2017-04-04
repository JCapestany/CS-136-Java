public class BetterRectangleTester
{
	/**
	Tester class for BetterRectangle.
	*/
	public static void main (String[] args)
	{
		BetterRectangle test = new BetterRectangle(0,0,17,27);
		System.out.printf("Rectangle located (%.0f,%.0f) with width %.0f and height %.0f.\n", test.getX(), test.getY(), test.getWidth(), test.getHeight());
		System.out.println("The area of the rectangle is:");
		System.out.println(test.getArea());
		System.out.println("The perimeter of the rectanlge is:");
		System.out.println(test.getPerimeter());
	}
}