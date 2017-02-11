// Lab 3
//Statements below import everything needed for this lab
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
Creates a car object of different sizes
*/
public class CustomCar extends JComponent
{
  private int x;
  private int y;
  private int car_length;
  private int f_wheel;
  private int b_wheel;
  private Color car_color;

  /**
  Initializes car values
  @param x_cord x-coordinate of top-left corner of the body
  @param y_cord y_coordinate of the top-left corner of the body
  @param length Length of the body
  @param front_wheel Radius of the front wheel
  @param back_wheel Radius of the back wheel
  @param color Color of the car
  */
  public CustomCar(int x_cord, int y_cord, int length, int front_wheel, int back_wheel, Color color)
  {
    x = x_cord;
    y = y_cord;
    car_length = length;
    f_wheel = front_wheel;
    b_wheel = back_wheel;
    car_color = color;
  }

  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    // Creates the car body
    Rectangle body = new Rectangle(x, y, car_length, 10);
    //Front windshield endpoints
    Point2D.Double r1 = new Point2D.Double(x+10,y);
    Point2D.Double r2 = new Point2D.Double(x+20,y-10);
    //Rear windshield endpoints
    Point2D.Double r3 = new Point2D.Double(x+car_length - 10, y);
    Point2D.Double r4 = new Point2D.Double(x+car_length-20,y-10);
    // Creates the front windshield
    Line2D.Double frontwindshield = new Line2D.Double(r1,r2);
    // Creates the rear windshield
    Line2D.Double rearwindshield = new Line2D.Double(r3,r4);
    // Creates the roof
    Line2D.Double roof = new Line2D.Double(r2,r4);
    // Creates the front tire
    Ellipse2D.Double fronttire = new Ellipse2D.Double(x+10 - f_wheel, y+10 - f_wheel, 2 * f_wheel, 2 * f_wheel);
    // Creates the rear tire
    Ellipse2D.Double backtire = new Ellipse2D.Double(x+car_length - 10 -b_wheel, y+10 - b_wheel, 2 * b_wheel, 2 * b_wheel);
    // Sets the car color to the Paint Bucket color
    g2.setColor(car_color);
    g2.fill(body);
    g2.draw(frontwindshield);
    g2.draw(rearwindshield);
    g2.draw(roof);
    // Sets the tire color to black
    g2.setColor(Color.black);
    g2.fill(fronttire);
    g2.fill(backtire);

  }
}
