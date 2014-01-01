// Exercise 1.3.13

public class Fibonacci
{
    public static void main(String[] args)
    {
        long f = 0, g = 1;
        
        for (int i = 0; i <= 80; i++)
        {
            System.out.println(f);
            
            f = f + g;
            g = f - g;
        }
    }
}