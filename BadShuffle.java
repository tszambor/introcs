// Exercise 1.4.23

public class BadShuffle
{
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        
        int[] sample = new int[M];
        int[][] analysis = new int[M][M];
        
        for (int i = 0; i < N; i++)
        {
            // initialize the sample
            for (int j = 0; j < M; j++)
                sample[j] = j;
            
            // shuffle the array
            for (int j = 0; j < M; j++)
            {
                int r = (int) (Math.random() * M);
                
                int t = sample[j];
                sample[j] = sample[r];
                sample[r] = t;
            }
            
            // update the analysis array
            for (int j = 0; j < M; j++)
                analysis[sample[j]][j]++;
        }
        
        // print the result
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(analysis[i][j] + " ");
            
            System.out.println();
        }
    }
}