// Exercise 1.2.31

public class Mercator
{
    public static void main(String[] args)
    {
        double lambda0 = Double.parseDouble(args[0]); // longitude 0 - center of the map
        double lat = Double.parseDouble(args[1]); // latitude
        double lambda = Double.parseDouble(args[2]); // longitude
        
        double x = lambda - lambda0;
        double y = 0.5 * Math.log((1 + Math.sin(lat)) / (1 - Math.sin(lat)));
        
        System.out.println("x = " + x + " y = " + y);
    }
}