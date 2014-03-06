// Exercise 1.5.21

public class RosePetals
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int res = 5000;
        
        StdDraw.setPenRadius(.005);
        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        for (int i = 0; i < res; i++)
        {
            double theta = 2.0 * Math.PI * i / res;
            
            double r = Math.sin(N * theta);
            
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            
            StdDraw.point(x, y);
        }
    }
}