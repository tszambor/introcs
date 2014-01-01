// Exercise 1.3.4

public class ValuesBetween
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
            