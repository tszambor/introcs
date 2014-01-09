// Exercise 1.3.31

public class RandomSpherePoint
{
    public static void main(String[] args)
    {
        double a, b;
        
        do
        {
            a = 2.0*Math.random() - 1.0;
            b = 2.0*Math.random() - 1.0;
        } while (Math.sqrt(a*a + b*b) > 1.0);
        
        double x, y, z;
        
        x = 2.0*a*Math.sqrt(1.0 - a*a - b*b);
        y = 2.0*b*Math.sqrt(1.0 - a*a - b*b);
        z = 1.0 - 2.0*(a*a + b*b);
        
        System.out.println(x + ", " + y + ", " + z);
    }
}