// Exercise 1.4.17

public class RectangularDotProduct
{
    public static void main(String[] args)
    {
        int M1 = Integer.parseInt(args[0]);
        int N1 = Integer.parseInt(args[1]);
        int M2 = Integer.parseInt(args[2]);
        int N2 = Integer.parseInt(args[3]);
        
        if (N1 == M2)
        {
            // initialize the arrays
            int[][] a = new int[M1][N1];
            int[][] b = new int[M2][N2];
            
            for (int i = 0; i < M1; i++)
                for (int j = 0; j < N1; j++)
                a[i][j] = (int) (Math.random() * 10);
            
            for (int i = 0; i < M2; i++)
                for (int j = 0; j < N2; j++)
                b[i][j] = (int) (Math.random() * 10);
        
            int[][] c = new int[M1][N2];
            
            for (int i = 0; i < M1; i++)
            {
                for (int j = 0; j < N2; j++)
                {
                    for (int k = 0; k < N1; k++)
                        c[i][j] += a[i][k]*b[k][j];
                }
            }
            
            // print the input and output arrays
            System.out.println("Array A");
            
            for (int i = 0; i < M1; i++)
            {
                for (int j = 0; j < N1; j++)
                    System.out.print(a[i][j] + " ");
                
                System.out.println();
            }
            
            System.out.println("Array B");
            
            for (int i = 0; i < M2; i++)
            {
                for (int j = 0; j < N2; j++)
                    System.out.print(b[i][j] + " ");
                
                System.out.println();
            }
            
            System.out.println("Array C");
            
            for (int i = 0; i < M1; i++)
            {
                for (int j = 0; j < N2; j++)
                    System.out.print(c[i][j] + " ");
                
                System.out.println();
            }
            
        }
        else
            System.out.println("The number of columns of first matrix does not match the number of rows of the second matrix.");
    }
}
        