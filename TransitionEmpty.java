// Program 1.6.1.
// Exercise 1.6.3

public class TransitionEmpty
{
    public static void main(String[] args)
    {
        // Print random-surfer probabilities.
        int N = StdIn.readInt();
        int[][] counts = new int[N][N];
        int[] outDegree = new int[N];
        
        while (!StdIn.isEmpty())
        {
            // Accumulate link counts.
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            
            counts[i][j]++;
            outDegree[i]++;
        }
        
        StdOut.println(N + " " + N);
        
        for (int i = 0; i < N; i++)
        {
            // Print probability distribution for row i.
            for (int j = 0; j < N; j++)
            {
                double p = 0.0;
                
                if (outDegree[i] > 0)
                {
                    // Print probability for column j.
                    p = .90 * counts[i][j] / outDegree[i] + .10/N;
                    
                }
                else
                {
                    p = 1.0 / N;
                }
                
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}