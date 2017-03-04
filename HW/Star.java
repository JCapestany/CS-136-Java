//Statements below import everything needed
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
Creates a star object
*/
public class Star extends JComponent
{
  private int x;
  private int y;

  /**
  Draws the star at (x,y).
  @param x_cord x cordinate
  @param y_cord y cordinate
  */
  public Star(int x_cord, int y_cord)
  {
	x = x_cord;
	y = y_cord;
  }

  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    //Creates the points of the star
    Point2D.Double r1 = new Point2D.Double(0+x,0+y);
    Point2D.Double r2 = new Point2D.Double(30+x,30+y);

    Point2D.Double r3 = new Point2D.Double(0+x,30+y);
    Point2D.Double r4 = new Point2D.Double(30+x,0+y);
 
	Point2D.Double r5 = new Point2D.Double(15+x,0+y);
	Point2D.Double r6 = new Point2D.Double(15+x,30+y);
	
	Point2D.Double r7 = new Point2D.Double(0+x,15+y);
	Point2D.Double r8 = new Point2D.Double(30+x,15+y);
 
	//Creates the lines using the points
    Line2D.Double l1 = new Line2D.Double(r1,r2);
	Line2D.Double l2 = new Line2D.Double(r3,r4);
	Line2D.Double l3 = new Line2D.Double(r5,r6);
	Line2D.Double l4 = new Line2D.Double(r7,r8);
    
    //Draws the star
    g2.setColor(Color.BLACK);
    g2.draw(l1);
	g2.draw(l2);
	g2.draw(l3);
	g2.draw(l4);
  }
}