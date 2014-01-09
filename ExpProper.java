// Exercise 1.3.36

public class ExpProper
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);

        double term = 1.0;
        double sum = 0.0;
        
        for (int n = 1; sum != sum + term; n++)
        {
            sum += term;
            term *= x/n;
        }
        
        System.out.println(sum);
        System.out.println(Math.exp(x));
    }
}