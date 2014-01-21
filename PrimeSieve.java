// Program 1.4.3

public class PrimeSieve
{
    public static void main(String[] args)
    {
        // Print the number of primes <= N.
        int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N+1];
        
        for (int i = 2; i <= N; i++)
            isPrime[i] = true;
        
        for (int i = 2; i <= N/i; i++)
        {
            if (isPrime[i])
            {
                // Mark multiples of i as nonprimes.
                for (int j = i; j <= N/i; j++)
                    isPrime[i * j] = false;
            }
        }
        
        // Count the primes.
        int primes = 0;
        for (int i = 2; i <= N; i++)
            if (isPrime[i]) primes++;
        
        System.out.println(primes);
    }
}