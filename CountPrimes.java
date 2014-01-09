// Exercise 1.3.34

public class CountPrimes
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int sumPrimes = 0;
        
        for (int i = 2; i <= N; i++)
        {
            boolean isPrime = true;
            
            for (int j = 2; j <= i / j; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime)
                sumPrimes++;
        }
        
        System.out.println(sumPrimes);
    }
}