// Exercise 1.2.25

public class WindChill
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]); // temperature, F
        double v = Double.parseDouble(args[1]); // wind speed, mph
        
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16); // formula valid if t < 50, v < 120
        
        System.out.println("Wind chill factor: " + w);
    }
}