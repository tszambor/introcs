// Exercise 2.1.30
// http://en.wikipedia.org/wiki/Black-Scholes

public class BlackScholes
{
    public static double blackScholes(double s, double x, double r, double sigma, double t)
    {
        double a = (Math.log(s/x) + t*(r + sigma*sigma/2)) / (sigma * Math.sqrt(t));
        double b = a - sigma*Math.sqrt(t);
        
        StdOut.println(a);
        StdOut.println(b);
        
        return s*Gaussian.Phi(a) - x*Math.exp(-r*t)*Gaussian.Phi(b);
    }
    
    public static void main(String[] args)
    {
        double s = Double.parseDouble(args[0]); // current stock price
        double x = Double.parseDouble(args[1]); // exercise price
        double r = Double.parseDouble(args[2]); // continously compounded riskfree interest rate
        double sigma = Double.parseDouble(args[3]); // standard deviation of the stock's return (volatility)
        double t = Double.parseDouble(args[4]); // time (in years) to maturity
        
        StdOut.printf("%.3f\n", blackScholes(s, x, r, sigma, t));
    }
}