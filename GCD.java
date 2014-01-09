// Exercise 1.3.28

public class GCD
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        while (x % y != 0)
        {
           if (x < y)
           {
               int tmp = x;
               x = y;
               y = tmp;
           }
           
           x = x % y;
        }
        
        System.out.println(y);
     }
}