// Exercise 2.1.30
// http://en.wikipedia.org/wiki/Black-Scholes

public class BlackScholes
{
    public static double phi(double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }
    
    public static double Phi(double z)
    {
        if (z < -8.0) return 0.0;
        if (z > 8.0) return 1.0;
        
        double sum = 0.0, term = z;
        
        for (int i = 3; sum != sum + term; i+= 2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        
        return 0.5 + phi(z) * sum;
    }
    
    public static double blackScholes(double s, double x, double r, double sigma, double t)
    {
        double a = (Math.log(s/x) + t*(r + sigma*sigma/2)) / (sigma * Math.sqrt(t));
        double b = a - sigma*Math.sqrt(t);
        
        StdOut.println(a);
        StdOut.println(b);
        
        return s*Phi(a) - x*Math.exp(-r*t)*Phi(b);
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