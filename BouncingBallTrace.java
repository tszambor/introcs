// Program 1.5.6
// Exercise 1.5.34

public class BouncingBallTrace
{
    public static void main(String[] args)
    {
        // Simulate the movement of a bouncing ball.
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        double rx = .480, ry = .860;

        double vx = .015, vy = .023;
        double radius = .05;
        
        StdDraw.clear(StdDraw.GRAY);
        
        while(true)
        {
            // Update ball position and draw it there.
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
            rx = rx + vx;
            ry = ry + vy;
            // StdDraw.clear();
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.circle(rx, ry, radius);
            StdDraw.show(20);
        }
    }
}