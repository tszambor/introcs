// Exercise 1.2.21

public class SineSum
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]);
        
        System.out.println(Math.sin(2 * t) + Math.cos(3 * t));
    }
}