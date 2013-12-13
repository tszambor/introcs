// Exercise 1.2.26
// Source for additional conversion information: http://www.mathsisfun.com/polar-cartesian-coordinates.html

public class PolarCoord
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        double r = Math.sqrt(x * x + y * y);
        
        // Math.atan2 - Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).
        double theta = Math.atan2(y, x);
        
        System.out.println("r = " + r + ", theta = " + theta);
        
    }
}