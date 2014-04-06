// Program 1.6.1.
// Exercise 1.6.19.

public class TransitionGraphicalSim
{
    public static void main(String[] args)
    {
        // Print random-surfer probabilities.
        int N = StdIn.readInt();
        int[][] counts = new int[N][N];
        int[] outDegree = new int[N];
        
        double[][] coord = new double[N][2];
        
        for (int i = 0; i < N; i++)
        {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            
            coord[i][0] = x;
            coord[i][1] = y;
        }
        
        while (!StdIn.isEmpty())
        {
            // Accumulate link counts.
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            
            counts[i][j]++;
            outDegree[i]++;
        }
        
        StdOut.println(N + " " + N);
        
        // print the coordinates
        for (int i = 0; i < N; i++)
            StdOut.printf("%8.5f %8.5f", coord[i][0], coord[i][1]);
        
        StdOut.println();
        
        for (int i = 0; i < N; i++)
        {
            // Print probability distribution for row i.
            for (int j = 0; j < N; j++)
            {
                // Print probability for column j.
                double p = .90 * counts[i][j] / outDegree[i] + .10/N;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}