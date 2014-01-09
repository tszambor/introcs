// Exercise 1.3.29

public class RelativelyPrime
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
            {
                int x = i;
                int y = j;
                
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
                
                if (y == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}