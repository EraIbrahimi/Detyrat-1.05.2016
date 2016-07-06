import java.awt.*;
/** Balls2 constructs and starts the objects in the animation */
public class BounceTheBall2
{ public static void main(String[] args)
{ // construct the model objects:
int box_size = 300;
int balls_radius = 6;
Box box = new Box(box_size);
MovingBall ball1 = new MovingBall((int)(box_size / 2.0), (int)(box_size / 5.0), balls_radius, box);
MovingBall ball2 = new MovingBall((int)(box_size / 5.0), (int)(box_size / 2.0), balls_radius, box);
// construct objects of output view:
BallWriter ball_writer1 = new BallWriter(ball1, Color.red);
BoxWriter box_writer = new BoxWriter(box);
BallWriter ball_writer2 = new BallWriter(ball2, Color.black);
AnimationWriter2 writer = new AnimationWriter2(box_writer, ball_writer1, ball_writer2, box_size);
// construct the controller and start it:
new BounceController2(ball1, ball2, writer).runAnimation();
}
}