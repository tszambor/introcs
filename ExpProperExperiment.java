// Exercise 1.3.36

public class ExpProperExperiment
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);

        int experiments = Integer.parseInt(args[1]);
        
        double result = 0.0;
        
        for (int i = 0; i < experiments; i++)
        {
            double term = 1.0;
            double sum = 0.0;
        
            for (int n = 1; sum != sum + term; n++)
            {
                sum += term;
                term *= x/n;
            }
        
            result = sum;
        }
        
        System.out.println(result);
        System.out.println(Math.exp(x));
    }
}