// Exercise 1.5.31

public class Spirographs
{
    public static void main(String[] args)
    {
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);
        
        StdDraw.setXscale(-2.0 * R, 2.0 * R);
        StdDraw.setYscale(-2.0 * R, 2.0 * R);
        
        double t = 0.0;
        
        while (t < 20.0 * Math.PI)
        {
            double x = (R + r) * Math.cos(t) - (r + a) * Math.cos((R + r) * t / r);
            double y = (R + r) * Math.sin(t) - (r + a) * Math.sin((R + r) * t / r);
            
            StdDraw.point(x, y);
            
            t += .002;
        }
    }
}