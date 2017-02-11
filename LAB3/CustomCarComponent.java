//Imports frame for veiwing drawing
import javax.swing.JFrame;
import java.awt.Color;

public class CustomCarComponent
{
    public static void main(String[] args)
    {
    // Creates new frame, and sets size, title, and exits on close
    JFrame frame = new JFrame();
    frame.setSize(216, 600);
    frame.setTitle("Cars");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Creates a PaintBucket object to add colors to
    PaintBucket bucket = new PaintBucket();
    bucket.addColor(150,0,0);
    // Adds the CustomCar to the frame, and displays it
    CustomCar car1 = new CustomCar(10,30,68,7,7,bucket.getColor());
    frame.add(car1);
    frame.setVisible(true);
    // Adds color to the PaintBucket object
    bucket.addColor(150,300,0);
    // Adds another car object
    CustomCar car2 = new CustomCar(10,70,40,2,10,bucket.getColor());
    frame.add(car2);
    frame.setVisible(true);
    // Adds a third color to the PaintBucket object
    bucket.addColor(150,150,450);
    // Creates a third car object
    CustomCar car3 = new CustomCar(10,110,100,12,6,bucket.getColor());
    frame.add(car3);
    frame.setVisible(true);
  }
}
