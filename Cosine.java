// Exercise 1.3.37

public class Cosine
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        double cosine = 0.0;
        
        double term = 1;
        
        for (int n = 1; cosine != cosine + term; n++)
        {
            cosine += term;
            
            term *= x * x / ((2*n - 1)*2*n);
            
            term = -1.0 * term;
        }
        
        System.out.println(cosine);
        System.out.println(Math.cos(x));
    }
}