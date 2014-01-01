// Exercise 1.3.15
// Based on exercise 1.2.24
// Source information: http://www.mathwords.com/c/continuously_compounded_interest.htm

public class LoanMonthly
{
    public static void main(String[] args)
    {
        double P = Double.parseDouble(args[0]); // principal, initital value deposited
        double t = Double.parseDouble(args[1]); // time for the deposit in years
        double r = Double.parseDouble(args[2]); // annual interest rate
        
        double compounded = P * Math.exp(r*t);
        System.out.println("Continously compounded interest: " + compounded);
                
        // Assume non-equal monthly payments
        double monthlyCapital = P / (t * 12);
        double monthly = monthlyCapital +  compounded / (t * 12);
        System.out.println("Monthly payment: " + monthly);
        
        System.out.println("Total paid after " + t + " years: " + monthly * 12 * t);
        
        for (int month = 1; month <= t * 12; month++)
        {
            P = P - monthlyCapital;
            
            System.out.println("Month " + month + "Paid: " + monthly * month +
                               ", Remaining principal: " + P);
        }
    }
}