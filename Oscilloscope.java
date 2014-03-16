// Exercise 1.5.33

public class Oscilloscope
{
    public static void main(String[] args)
    {
        double Ax = Double.parseDouble(args[0]); // amplitude in x axis?
        double Ay = Double.parseDouble(args[1]); // amplitude in y axis?
        double thetaX = Double.parseDouble(args[2]);
        double thetaY = Double.parseDouble(args[3]);
        double wX = Double.parseDouble(args[4]);
        double wY = Double.parseDouble(args[5]);
        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        StdDraw.setPenRadius(0.005);
        
        double t = 0.0;
        
        while (t < 20 * Math.PI)
        {
            double x = Ax * Math.sin(wX * t + thetaX);
            double y = Ay * Math.sin(wY * t + thetaY);
            
            StdDraw.point(x, y);
            
            t += .003;
        }
    }
}