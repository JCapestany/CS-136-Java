//Imports frame for veiwing drawing
import javax.swing.JFrame;

public class StarViewer
{
    public static void main(String[] args)
    {
    // Creates new frame, and sets size, title, and exits on close
    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    frame.setTitle("STARS");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    // Creates 3 Star objects
    StarComponent star1 = new StarComponent(0,0);
    frame.add(star1);
    frame.setVisible(true);
	
	StarComponent star2 = new StarComponent(40,30);
    frame.add(star2);
    frame.setVisible(true);
	
	StarComponent star3 = new StarComponent(0,60);
    frame.add(star3);
    frame.setVisible(true);
  }
}