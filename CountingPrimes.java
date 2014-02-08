// Exercise 1.4.29

// it seems this algorithm is about 10x slower than the prime sieve
// PrimeSieve CountingPrimes
// 1000000 1000000
// 1s      1s
// 10000000 10000000
// 1s       25.02 s    // x1 (?) 10x bigger input takes ~25x more for counting primes, 4x more with
// 100000000 100000000 // /x4 25
// 3.53 s    652.35 s
public class CountingPrimes
{
    public static void main(String[] args)
    {
        long N = Integer.parseInt(args[0]);
        
        int sum = 0;
        
        for (long i = 2; i <= N; i++)
        {
            boolean isPrime = true;
        
            for (long j = 2; j <= i / j; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime)
                sum++;
        }
        
        System.out.println(sum);
    }
}