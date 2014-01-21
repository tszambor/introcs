// Exercise 1.4.11

public class CopyArrayA
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int[][] a = new int[N][N];
        
        // initialize the square source array
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            a[i][j] = (int) (Math.random()*N);
        
        int M = a.length;
        
        int[][] b = new int[M][M];
        
        for (int i = 0; i < M; i++)
            for (int j = 0; j < M; j++)
            b[i][j] = a[i][j];
 
        
        // print the source array
        System.out.println("Source array");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
        
        // print the destination array
        System.out.println("Destination array");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}