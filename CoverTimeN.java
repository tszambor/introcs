// Program 1.6.2
// Exercise 1.6.18

public class CoverTimeN
{
    public static void main(String[] args)
    {
        // Simulate random-surfer leaps and links.
        int T = Integer.parseInt(args[0]); // how many experiments should be run?
        int N = StdIn.readInt();
        StdIn.readInt();
        
        // Read transition matrix.
        double[][] p = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            p[i][j] = StdIn.readDouble();
        
        int sumSteps = 0;
        
        for (int t = 0; t < T; t++)
        {
            int page = (int) (Math.random() * N); // Start at page 0.
        
            int[] freq = new int[N];
            boolean[] hit = new boolean[N]; // was a specific page visited already?
            int pagesHit = 0; // how many pages did we visit?
            int steps = 0;
        
            while (pagesHit < N)
            {
                if (!hit[page])
                {
                    hit[page] = true;
                    pagesHit++;
                }
                
                // Make one random move.
                double r = Math.random();
                double sum = 0.0;
                for (int j = 0; j < N; j++)
                {
                    // Find interval containing r.
                    sum += p[page][j];
                    if (r < sum)
                    {
                        page = j;
                        break;
                    }
                }
                
                freq[page]++;
                
                steps++;
            }
            
            sumSteps+= steps;
        }
       
        // Print the average amount of steps to visit all pages
        StdOut.printf("%8.2f", (double) ((1.0 * sumSteps) / T));
        StdOut.println();
    }
}