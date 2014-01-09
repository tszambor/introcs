// Exercise 1.3.36

public class Exp
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        //  1 + x + x^2/2!
        
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
        
        System.out.println(term);
        System.out.println(Math.exp(x));
    }
}