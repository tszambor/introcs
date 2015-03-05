public class TestGaussianRandomValues {
    public static double uniform(double min, double max)
    {
        return (min + Math.random() * (max - min));
    }
    
    public static double gaussian()
    {
        double r, x, y;
        do {
            x = uniform(-1.0, 1.0); 
            y = uniform(-1.0, 1.0); 
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2.0 * Math.log(r) / r);
    }
    
    public static void main(String[] args)
    {
        double min = gaussian();
        double max = min;
        
        int N = Integer.parseInt(args[0]);
        
        for (int i = 0; i < N; i++)
        {
            double val = gaussian();
            if (val < min)
                min = val;
            else if (val > max)
                max = val;
        }
        
        StdOut.println("The minimum value " + min + ", maximum value " + max);
    }
}