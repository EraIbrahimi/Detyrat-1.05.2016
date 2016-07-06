import java.awt.*;
import javax.swing.*;
/** AnimationWriter displays a box with two balls in it. */
public class AnimationWriter2 extends JPanel
{ private BoxWriter box_writer;  // the output-view of the box
private BallWriter ball_writer1; // the output-view of the ball1 in the box
private BallWriter ball_writer2; // the output-view of the ball2 in the box
/** Constructor AnimationWriter2 constructs the view of box and balls
* @param k - the box's writer
* @param t1 - the ball1's writer
* @param t2 - the ball2's writer
* @param size - the frame's size */
public AnimationWriter2(BoxWriter k, BallWriter t1, BallWriter t2, int size)
{ box_writer = k;
  ball_writer1 = t1;
  ball_writer2 = t2;
JFrame my_frame = new JFrame();
my_frame.getContentPane().add(this);
my_frame.setTitle("Bouncing Balls");
my_frame.setSize(size, size);
my_frame.setVisible(true);
}
/** paintComponent paints the box and ball
* @param g - the graphics pen */
public void paintComponent(Graphics g)
{ box_writer.paint(g);
ball_writer1.paint(g);
ball_writer2.paint(g);
}
}
