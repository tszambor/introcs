// Exercise 1.3.27

public class Checkerboard
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        for (int y = 0; y < N; y++)
        {
            for (int x = 0; x < N; x++)
            {
                if (y % 2 == 0)
                {
                    if (x % 2 == 0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    if (x % 2 == 0)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
            }
            
            System.out.println();
        }
    }
}
            