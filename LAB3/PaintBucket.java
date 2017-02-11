import java.awt.Color;
/**
A class for creating a custom paint color
*/
public class PaintBucket
{
  private int r;
  private int g;
  private int b;
  private int count;

  public PaintBucket()
  {}
    /**
    Adds colors to the paint bucket
    @param red Red component of a RGB color(0-255)
    @param green Green component of a RGB color(0-255)
    @param red Blue component of a RGB color(0-255)
    */
  public void addColor(int red, int green, int blue)
  {
    r = r + red;
    g = g + green;
    b = b + blue;
    count = count + 1;
  }
  /**
  Gets the current paint color after colors have been added
  @return Returns the color that is the average of each RGB color added
  */
  public Color getColor()
  {
    Color color = new Color(r/count,g/count,b/count);
    return color;
  }
}
