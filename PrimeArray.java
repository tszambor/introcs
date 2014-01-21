// Exercise 1.4.14

public class PrimeArray
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean[][] a = new boolean[N+1][N+1];
        
        // initialize the array to all true
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
            a[i][j] = true;
        
        // sieve through the array (not really sieving now, am I?)
        for (int i = 2; i <= N; i++)
        {
            for (int j = 2; j <= N; j++)
            {
                if (i % j == 0)
                {
                    // mark all multipliers of j as false
                    for (int k = 1; k <= N/j; k++)
                    {
                        a[i][j*k] = false;
                    }
                }
            }
        }
        
        /* this was probably not a proper sieve algorithm, but it stays nevertheless since it is working ;)
         * might be worthy to compare the complexity and speed of both though, one day :)

        for (int factor = 2; factor <= N; factor++)
        {
            for (int i = 2; i <= N; i++)
            {
                for (int j = 2; j <= N; j++)
                {
                    if (i % factor == 0 && j % factor == 0)
                    {
                        a[i][j] = false;
                    }
                }
            }
        }
        */
        
        // print column numbers
        
        if (N < 10)
            System.out.print(" ");
        else
            System.out.print("  ");
                             
        for (int i = 1; i <= N; i++)
        {
            if (i < 10)
                System.out.print(" " + i);
            else
                System.out.print(i);
        }
        
        System.out.println();
        
        for (int i = 1; i <= N; i++)
        {
            if (i < 10 && N > 9)
                System.out.print(" " + i + " ");
            else
                System.out.print(i + " ");
            
            for (int j = 1; j <= N; j++)
            {
                if (a[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}