// Exercise 1.5.15

public class ClosestPoint
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        
        double x0 = 0.0, y0 = 0.0, z0 = 0.0;
        double distance = 0.0;
        
        boolean firstRun = true;
        
        while (!StdIn.isEmpty())
        {
            double x1 = StdIn.readDouble();
            double y1 = StdIn.readDouble();
            double z1 = StdIn.readDouble();
            
            /* double x1d = (x - x1);
            double y1d = (y - y1);
            double z1d = (z - z1);
                
            double d1 = x1d*x1d + y1d*y1d + z1d*z1d; */
            
            // Speed hack: if sum of the squares has to be the smallest, why not just the sum?
            
            double d1 = Math.abs(x - x1) + Math.abs(y - y1) + Math.abs(z - z1);
            
            if (firstRun)
            {
                x0 = x1;
                y0 = y1;
                z0 = z1;
                
                distance = d1;
                
                firstRun = false;
            }
            else if (d1 < distance)
            {
                distance = d1;
                    
                x0 = x1;
                y0 = y1;
                z0 = z1;
            }
        }
        
        StdOut.printf("Closest coordinates: x %.3f, y %.3f, z %.3f.", x0, y0, z0);
        StdOut.println();
    }
}