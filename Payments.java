// Exercise 1.5.14

public class Payments
{
    public static void main(String[] args)
    {
        double P = Double.parseDouble(args[0]); // principal, initital value deposited
        double t = Double.parseDouble(args[1]); // time for the deposit in years
        double r = Double.parseDouble(args[2]); // annual interest rate
        
        double compounded = P * Math.exp(r*t);
        
        double monthlyCapital = P / (t * 12);
        double monthly = monthlyCapital +  compounded / (t * 12);
        
        int months = (int) (t * 12.0);
        
        for (int i = 0; i < months; i++)
        {
            P = P - monthlyCapital;
            
            StdOut.printf("Month %2d payment %.2f remaining principal %.2f interest %.2f", i+1, monthly, P, compounded / (t * 12));
            StdOut.println();
        }
    }
}
        
        
        