import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class DrawingBlockComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    //Placing the I blocks
    g2.setColor(Color.CYAN);
    Rectangle i_block = new Rectangle(0,0,20,80);
    g2.rotate(Math.toRadians(90));
    i_block.translate(540,-80);
    g2.fill(i_block);
    i_block.translate(-540,80);
    g2.rotate(Math.toRadians(-90));
    i_block.translate(0,420);
    g2.fill(i_block);

    //Placing the O blocks
    g2.setColor(Color.YELLOW);
    Rectangle o_block = new Rectangle(0,0,40,40);
    o_block.translate(0,500);
    g2.fill(o_block);
    o_block.translate(80,20);
    g2.fill(o_block);

    //Placing the Z blocks
    g2.setColor(Color.RED);
    Rectangle z_block1 = new Rectangle(0,0,40,20);
    Rectangle z_block2 = new Rectangle(20,20,40,20);
    z_block1.translate(120,520);
    z_block2.translate(120,520);
    g2.fill(z_block2);
    g2.fill(z_block1);
    z_block1.translate(-120,-520);
    z_block2.translate(-120,-520);
    g2.rotate(Math.toRadians(90));
    z_block1.translate(480,-100);
    z_block2.translate(480,-100);
    g2.fill(z_block2);
    g2.fill(z_block1);
    g2.rotate(Math.toRadians(-90));

    //Placing the S blocks
    g2.setColor(Color.GREEN);
    Rectangle s_block1 = new Rectangle(20,0,40,20);
    Rectangle s_block2 = new Rectangle(0,20,40,20);
    s_block1.translate(40,460);
    s_block2.translate(40,460);
    g2.fill(s_block1);
    g2.fill(s_block2);
    s_block1.translate(-40,-460);
    s_block2.translate(-40,-460);
    g2.rotate(Math.toRadians(90));
    s_block1.translate(500,-200);
    s_block2.translate(500,-200);
    g2.fill(s_block1);
    g2.fill(s_block2);
    g2.rotate(Math.toRadians(-90));

    //Placing the J blocks
    g2.setColor(Color.BLUE);
    Rectangle j_block1 = new Rectangle(20,0,20,60);
    Rectangle j_block2 = new Rectangle(0,40,20,20);
    j_block1.translate(20,420);
    j_block2.translate(20,420);
    g2.fill(j_block1);
    g2.fill(j_block2);
    j_block1.translate(-20,-420);
    j_block2.translate(-20,-420);
    g2.rotate(Math.toRadians(90));
    j_block1.translate(480,-160);
    j_block2.translate(480,-160);
    g2.fill(j_block1);
    g2.fill(j_block2);
    g2.rotate(Math.toRadians(-90));

    //Placing the L blocks
    g2.setColor(Color.ORANGE);
    Rectangle l_block1 = new Rectangle(0,0,20,60);
    Rectangle l_block2 = new Rectangle(20,40,20,20);
    l_block1.translate(160,440);
    l_block2.translate(160,440);
    g2.fill(l_block1);
    g2.fill(l_block2);
    l_block1.translate(-160,-440);
    l_block2.translate(-160,-440);
    g2.rotate(Math.toRadians(90));
    l_block1.translate(420,-140);
    l_block2.translate(420,-140);
    g2.fill(l_block1);
    g2.fill(l_block2);
    g2.rotate(Math.toRadians(-90));

    //Placing the T blocks
    g2.setColor(Color.MAGENTA);
    Rectangle t_block1 = new Rectangle(0,0,60,20);
    Rectangle t_block2 = new Rectangle(20,20,20,20);
    t_block1.translate(0,400);
    t_block2.translate(0,400);
    g2.fill(t_block1);
    g2.fill(t_block2);
    t_block1.translate(0,-400);
    t_block2.translate(0,-400);
    g2.rotate(Math.toRadians(90));
    t_block1.translate(400,-200);
    t_block2.translate(400,-200);
    g2.fill(t_block1);
    g2.fill(t_block2);

  }
}
