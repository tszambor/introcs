// Exercise 1.3.36

public class ExpExperiment
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        int experiments = Integer.parseInt(args[1]);
        
        //  1 + x + x^2/2!
        double result = 0.0;
        
        for (int n = 0; n < experiments; n++)
        {

            double precision = 1e-15;
        
            long i = 1;
        
            double term = 1.0, currentTerm = 0.0;
            long power = 1;
        
            do
            {
                // losing accuracy here! wrong solution! :)
                power = power * i;
                currentTerm = Math.pow(x, i) / power;
            
                term += currentTerm;
                i++;
            } while (currentTerm > precision);
            
            result = term;
            
        }
        
        System.out.println(result);
        System.out.println(Math.exp(x));
    }
}