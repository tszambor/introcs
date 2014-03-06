// Exercise 1.5.22

public class Banner
{
    public static void main(String[] args)
    {
        String s = args[0];
        
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        
        for (double i = 0.0; true; i += .01)
        {
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.text((i % 1.0),       0.5, s);
            StdDraw.text((i % 1.0) - 1.0, 0.5, s);
            StdDraw.text((i % 1.0) + 1.0, 0.5, s);
            StdDraw.show(60);
        }
    }
}