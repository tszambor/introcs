// Exercise 1.5.29

public class TerrainAnalysis
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        double[][] terrain = new double[N][M];
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (!StdIn.isEmpty())
                    terrain[i][j] = StdIn.readDouble();
                else
                    break;
            }
        }
        
        int peaks = 0;
        
        for (int i = 1; i < (N-1); i++)
        {
            for (int j = 1; j < (M-1); j++)
            {
                double t = terrain[i][j];
                
                if (t > terrain[i-1][j] && t > terrain[i+1][j] && t > terrain[i][j-1] && t > terrain[i][j+1])
                    peaks++;
            }
        }
        
        StdOut.println(peaks);
    }
}