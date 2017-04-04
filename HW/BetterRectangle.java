public class BetterRectangle extends java.awt.Rectangle
{
	/**
	Initializes a Rectangle that can use BetterRectangle methods.
	@param x x-coordinate of location
	@param y y-coordinate of location
	@param width width of the rectangle
	@param height height of the rectangle
	*/
	public BetterRectangle(int x, int y, int width, int height)
	{
		super.setSize(width, height);
		super.setLocation(x, y);
	}
	
	/**
	Calculates the area of the rectangle by calling getter methods.
	*/
	public double getArea()
	{
		double area = super.getHeight() * super.getWidth();
		return area;
	}
	
	/**
	Calculates the perimeter of the rectangle by calling getter methods.
	*/
	public double getPerimeter()
	{
		double perimeter = 2*super.getHeight() + 2*super.getWidth();
		return perimeter;
	}
}