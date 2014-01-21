// Exercise 1.4.15

public class BoolMatrixProduct
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean[][] a = new boolean[N][N];
        boolean[][] b = new boolean[N][N];
        
        // initialize the arrays with random values
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (Math.random() < 0.50)
                    a[i][j] = true;
                
                if (Math.random() < 0.50)
                    b[i][j] = true;
            }
        }
        
        boolean[][] c = new boolean[N][N];
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                for (int k = 0; k < N; k++)
                    c[i][j] = c[i][j] || (a[i][k] && b[k][j]);
            }
        }

        System.out.println("Source Matrix A");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (a[i][j])
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
        }
        
        System.out.println("Source Matrix B");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (b[i][j])
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
        }

        System.out.println("Output Matrix C");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (c[i][j])
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}