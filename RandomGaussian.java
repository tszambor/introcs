// Exercise 2.1.28
// Gaussian random values.

public class RandomGaussian
{
    public static double uniform(double min, double max)
    {
        return (min + Math.random() * (max - min));
    }
    
    public static double gaussian()
    {
        double r, x, y;
        do
        {
            x = uniform(-1.0, 1.0);
            y = uniform(-1.0, 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        
        return x * Math.sqrt(-2 * Math.log(r) / r);
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[] a = new int[20];
        
        for (int i = 0; i < N; i++)
        {
            double r = gaussian();
            StdOut.println(r);
            int pos = (int) Math.floor(r / .05);
            StdOut.println(pos);
            if (pos >=0 && pos < 20)
                a[pos]++;
        }
        
        // find maximum value in the array
        int max = 0;
        
        for (int i = 0; i < 20; i++)
        {
            if (a[i] > max)
                max = a[i];
        }
        
        StdDraw.setXscale(0.0, 20.0);
        StdDraw.setYscale(0.0, max);
        
        for (int i = 0; i < 20; i++)
        {
            double[] x = { i, i + 1, i + 1, i};
            double[] y = { 0.0, 0.0, a[i], a[i]};
            
            StdDraw.filledPolygon(x, y);
        }
    }
}