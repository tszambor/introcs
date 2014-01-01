// Exercise 1.3.18

public class KthRoot
{
    public static void main(String[] args)
    {
        int k = Integer.parseInt(args[0]); // equation is x^k - c
        double c = Double.parseDouble(args[1]); // this is the number we "root"
        double epsilon = 1e-15;
        double t = c;
        
        while (Math.abs(t - c/Math.pow(t, k-1)) > epsilon * t)
        {
            // Replace t by the average of t and c/t.
            t = t - t / (k * 1.0) + c/Math.pow(t, k-1) / (k*1.0);
        }
        
        System.out.println(t);
    }
}