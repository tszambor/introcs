// Exercise 1.4.24

public class PermutationsMinimaExp
{
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int minNo = 0;
        
        for (int exp = 0; exp < M; exp++)
        {
            int[] permutation = new int[N];
            
            for (int i = 0; i < N; i++)
                permutation[i] = i;
            
            for (int i = 0; i < N; i++)
            {
                int r = i + (int) (Math.random() * (N-i));
                
                int t = permutation[i];
                permutation[i] = permutation[r];
                permutation[r] = t;
            }
        
            // calculate the number of left-to-right minima
            int min = permutation[0];
            
            for (int i = 1; i < N; i++)
            {
                if (permutation[i] < min)
                {
                    min = permutation[i];
                    minNo++;
                }
            }
        }
        
        System.out.println("Average number of left-to-right minima: " + 1.0 * minNo / M);
        System.out.println(Math.log(N)); // that is my hipothesis for the extra credit :)
    }
}