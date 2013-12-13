// Exercise 1.2.28

public class OrderCheck
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        
        boolean order = (x < y && y < z) || (z < y && y < x);
        
        System.out.println(order);
    }
}