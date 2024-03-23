// Exercise 2.1.29

public class GaussianBSearch
{
    // Implement Gaussian (normal) distribution functions.
    public static double phi(double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }
    
    public static double Phi(double z)
    {
        if (z < -8.0) return 0.0;
        if (z > 8.0) return 1.0;
        
        double sum = 0.0, term = z;
        
        for (int i = 3; sum != sum + term; i+= 2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        
        return 0.5 + phi(z) * sum;
    }
    
    public static double PhiInverse(double y)
    {
        double epsilon = 1e-15;
        
        double min = -8.0;
        double max = 8.0;
        
        double x0 = min + (max - min) / 2.0;
        
        double val = Phi(x0);
        
        while (Math.abs(val-y) > epsilon)
        {
            if (val > y)
                max = x0;
            else if (val < y)
                min = x0;
            
            x0 = min + (max - min) / 2.0;
            
            val = Phi(x0);
        }
        
        return x0;
    }
    
    public static void main(String[] args)
    {
        double mu = Double.parseDouble(args[0]);
        double sigma = Double.parseDouble(args[1]);
        double p = Double.parseDouble(args[2]);
        p /= 100.0;
        double res = PhiInverse(p) * sigma + mu;
        StdOut.printf("NeededValue: %.3f\n", res);
        StdOut.printf("Phi        : %.3f\n", Phi((res - mu) / sigma));
    }
}