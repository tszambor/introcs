// Exercise 1.4.24

public class PermutationsMinima
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
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
        int minNo = 0;
        int min = permutation[0];
        
        for (int i = 1; i < N; i++)
            if (permutation[i] < min)
            {
                min = permutation[i];
                minNo++;
            }
        
        System.out.println(minNo);
    }
}