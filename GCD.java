// Exercise 1.3.28

public class GCD
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        int gcd = 0;
        
        if (x > y)
        {
            if (x % y == 0)
                gcd = y;
        }
        else
        {
            // gcd = gcd(x % y and y)
        }
    }
}