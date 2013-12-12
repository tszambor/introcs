// Exercise 1.2.18

public class CartesianDistance
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        System.out.println("Distance to the point is " + Math.sqrt(x*x + y*y));
    }
}