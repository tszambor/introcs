// Exercise 1.3.36

public class ExpMathExperiment
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);

        int experiments = Integer.parseInt(args[1]);
        
        double result = 0.0;
        
        for (int i = 0; i < experiments; i++)
        {
            result = Math.exp(x);
        }
        
        System.out.println(result);
        System.out.println(Math.exp(x));
    }
}