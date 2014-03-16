// Program 1.5.6
// Exercise 1.5.35

public class BouncingBallGravity
{
    public static void main(String[] args)
    {
        // Simulate the movement of a bouncing ball.
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double rx = .480, ry = .860;
        double vx = .015, vy = .023;
        double radius = .05;
        double gravityX = vx / 10.0;
        double gravityY = vy / 10.0;
        
        double[] sound = StdAudio.read("laser.wav");
        
        while(true)
        {
            // Update ball position and draw it there.
            if (Math.abs(rx + vx) + radius > 1.0)
            {
                vx = -vx;
                StdAudio.play(sound);
                if (Math.abs(vx) < .001)
                    break;
            }
            
            if (Math.abs(ry + vy) + radius > 1.0)
            {
                vy = -vy;
                StdAudio.play(sound);
                if (Math.abs(vy) < .001)
                    break;
            }
            
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show(20);
            vx *= 1.0 - gravityX;
            vy *= 1.0 - gravityY;
        }
    }
}