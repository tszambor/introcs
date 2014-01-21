// Exercise 1.4.11

public class CopyArrayB
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        int[][] a = new int[N][M];
        
        // initialize the rectangular source array
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
            a[i][j] = (int) (Math.random()*N*M);
        
        int n = a.length;
        int m = a[0].length;
        
        int[][] b = new int[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            b[i][j] = a[i][j];
 
        
        // print the source array
        System.out.println("Source array");
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
        
        // print the destination array
        System.out.println("Destination array");
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}