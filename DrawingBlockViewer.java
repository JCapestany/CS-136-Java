import javax.swing.JFrame;

public class DrawingBlockViewer
{
    public static void main(String[] args)
    {
    JFrame frame = new JFrame();
    frame.setSize(216, 616);
    frame.setTitle("A Drawing of Blocks");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DrawingBlockComponent component = new DrawingBlockComponent();
    frame.add(component);

    frame.setVisible(true);
  }
}
