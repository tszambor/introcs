// Exercise 1.4.16

public class SpreadsheetWeighted
{
    public static void main(String[] args)
    {
        // page 104
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        
        int[][] a = new int[M][N+1];
        
        // initialize with random values
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
            a[i][j] = (int) (Math.random() * N * M);
        
        // create and initialize the vector of weigths
        double[] weights = new double[N];
        
        for (int i = 0; i < N; i++)
            weights[i] = 1.0 / N;
        
        for (int i = 0; i < M; i++)
        {
            double sum = 0.0;
            for (int j = 0; j < N; j++)
                sum += (a[i][j] * weights[j]);
            
            a[i][N] = (int) Math.round(sum);
        }
        
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j <= N; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
    }
}