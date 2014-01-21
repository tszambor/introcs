public class Sample
{
    public static void main(String[] args)
    {
        // Print a random sample of M integers
        // from 0 ... N-1 (no duplications).
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        
        int[] perm = new int[N];
        
        // Initialize perm[].
        for (int j = 0; j < N; j++)
            perm[j] = j;
        
        // Take sample.
        for (int i = 0; i < M; i++)
        {
            // Exchange perm[i] with a random element to its right.
            int r = i + (int) (Math.random() * (N-i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        
        // Print sample.
        for (int i = 0; i < M; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
}