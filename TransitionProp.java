// Program 1.6.1.
// Exercise 1.6.1

public class TransitionProp
{
    public static void main(String[] args)
    {
        // the leap probability
        double probability = Double.parseDouble(args[0]);
        
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
                // Print probability for column j.
                double p = probability * counts[i][j] / outDegree[i] + (1.0 - probability)/N;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}