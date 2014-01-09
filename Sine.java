// Exercise 1.3.37

public class Sine
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        double sine = 0.0;
        
        double term = x;
        
        for (int n = 1; sine != sine + term; n++)
        {
            sine += term;
            
            term *= x * x / (2*n*(2*n+1));
            
            term = -1.0 * term;
        }
        
        System.out.println(sine);
        System.out.println(Math.sin(x));
    }
}