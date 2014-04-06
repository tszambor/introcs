// Program 1.6.2
// Exercise 1.6.19

public class RandomSurferGraphicalSim
{
    public static void main(String[] args)
    {
        // Simulate random-surfer leaps and links.
        int T = Integer.parseInt(args[0]);
        int N = StdIn.readInt();
        StdIn.readInt();
        
        // Read transition matrix.
        double[][] p = new double[N][N];
        double[][] coord = new double[N][2];
        
        
        for (int i = 0; i < N; i++)
        {
            coord[i][0] = StdIn.readDouble(); // X coordinate
            coord[i][1] = StdIn.readDouble(); // Y coordinate
        }
        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            p[i][j] = StdIn.readDouble();
        
        int page = 0; // Start at page 0.
        
        int[] freq = new int[N];
        
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        // StdDraw.setPenRadius(.5/N);
        
        for (int t = 0; t < T; t++)
        {
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
            
            StdDraw.clear();
            
            for (int i = 0; i < N; i++)
                StdDraw.filledCircle(coord[i][0], coord[i][1], (double) freq[i] / (T * 8.0));
            
            StdDraw.show(20);
        }
        
        // Print page ranks.
        for (int i = 0; i < N; i++)
            StdOut.printf("%8.5f", (double) freq[i] / T);
        StdOut.println();
    }
}