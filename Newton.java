// Program 1.3.6
// New take on it from page 124

public class Newton
{
    public static void main(String[] args)
    {
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;
        double t = c;
        
        while (Math.abs(t - c/t) > epsilon * t)
        {
            // Replace t by the average of t and c/t.
            t = (c/t + t) / 2.0;
        }
        
        StdOut.printf("The square root of %.1f is %.6f\n", c, t);
    }
}