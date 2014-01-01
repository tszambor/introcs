// Exercise 1.2.25
// modified according to 1.3.5

public class WindChillProp
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]); // temperature, F
        double v = Double.parseDouble(args[1]); // wind speed, mph
        
        if (t <= 50 && v <= 120 && v >= 3)
        {
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16); // formula valid if t <= 50, v <= 120 and v >= 3
            System.out.println("Wind chill factor: " + w);
        }
        else
            System.out.println("The formula used by this program is not valid" +
                               " for temperature bigger than 50 F and wind speed" +
                               " bigger than 120 mph or smaller than 3 mph");
    }
}