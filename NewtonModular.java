// Program 2.1.1

public class NewtonModular
{
    public static double abs(double arg)
    {
        if (arg < 0.0)
            arg *= -1.0;
        
        return arg;
    }
    
    public static double sqrt(double c)
    {
        // Compute the square root of c.
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }
    
    public static void main(String[] args)
    {
        // Print square roots of arguments.
        int N = args.length;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = Double.parseDouble(args[i]);
        for (int i = 0; i < N; i++)
        {
            // Print square root of ith argument.
            double x = sqrt(a[i]);
            StdOut.println(x);
        }
    }
}