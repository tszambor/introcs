// Exercise 1.2.24
// Source information: http://www.mathwords.com/c/continuously_compounded_interest.htm

public class Loan
{
    public static void main(String[] args)
    {
        double P = Double.parseDouble(args[0]); // principal, initital value deposited
        double t = Double.parseDouble(args[1]); // time for the deposit in years
        double r = Double.parseDouble(args[2]); // annual interest rate
        
        System.out.println("Continously compounded interest: " + P * Math.exp(r*t));
    }
}