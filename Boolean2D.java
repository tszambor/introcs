// Exercise 1.4.6

public class Boolean2D
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean[][] a = new boolean[N][N];
        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (Math.random() < 0.50)
                    a[i][j] = true;
        
        // print column numbers
        
        if (N < 10)
            System.out.print(" ");
        else
            System.out.print("  ");
                             
        for (int i = 0; i < N; i++)
        {
            if (i < 10)
                System.out.print(" " + i);
            else
                System.out.print(i);
        }
        
        System.out.println();
        
        for (int i = 0; i < N; i++)
        {
            if (i < 10 && N > 9)
                System.out.print(" " + i + " ");
            else
                System.out.print(i + " ");
            
            for (int j = 0; j < N; j++)
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
            