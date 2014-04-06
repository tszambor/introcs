// Program 1.6.3

public class Markov
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
        
        // Use the power method to compute page ranks.
        
        double[] rank = new double[N];
        rank[0] = 1.0;
        
        for (int t = 0; t < T; t++)
        {
            // Compute effect of next move on page ranks.
            double[] newRank = new double[N];
            for (int j = 0; j < N; j++)
            {
                // New rank of page j is dot product
                // of old ranks and column j of p[][].
                for (int k = 0; k < N; k++)
                    newRank[j] += rank[k]*p[k][j];
            }
            for (int j = 0; j < N; j++)
                rank[j] = newRank[j];
        }
        
        for (int i = 0; i < N; i++)  // Print page ranks.
            StdOut.printf("%8.5f", rank[i]);
        StdOut.println();
    }
}