// Exercise 1.6.13

public class MatrixSquaring
{
    // Compute page ranks afer T moves.
    public static void main(String[] args)
    {
        int T = Integer.parseInt(args[0]);
        int N = StdIn.readInt();
        StdIn.readInt();
        
        // Read p[][] from StdIn.
        double[][] p = new double[N][N];
        for(int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            p[i][j] = StdIn.readDouble();
        
        // Now square the p matrix T times (Matrix 2^N)
        
        for (int t = 0; t < T; t++)
        {
            // Compute effect of next move on page ranks.
            double[][] res = new double[N][N];
            
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    for (int k = 0; k < N; k++)
                        res[i][j] += p[i][k]*p[k][j];
            
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    p[i][j] = res[i][j];
        }
        
        // Print the resulting matrix
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                StdOut.printf("%8.5f", p[i][j]);
            
            StdOut.println();
        }
    }
}