// Exercise 1.4.24

public class MusicShuffle
{
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        
        int[] playlist = new int[M];
        
        double sumProb = 0.0;
        
        for (int i = 0; i < N; i++)
        {
            int sequences = 0;
            
            for (int j = 0; j < M; j++)
                playlist[j] = j;
            
            for (int j = 0; j < M; j++)
            {
                int r = j + (int) (Math.random() * (M - j));
                
                int t = playlist[j];
                playlist[j] = playlist[r];
                playlist[r] = t;
            }
            
            for (int j = 1; j < M; j++)
                if (playlist[j] == playlist[j-1] + 1)
                    sequences++;
            
            sumProb += 1.0 * sequences / (M - 1.0);
        }
        
        sumProb /= N;
        
        System.out.println(1.0-sumProb);
    }
}