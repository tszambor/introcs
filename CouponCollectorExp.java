// Exercise 1.4.36

public class CouponCollectorExp
{
    public static void main(String[] args)
    {
        // Generate random values in (0..N] until finding each one.
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        // calculate the Nth harmonic number
        double hN = 0.0;
        
        for (int i = 1; i<= N; i++)
        {
            // Add the ith term to the sum
            hN += 1.0/i;
        }
        
        int sumCount = 0;
        
        for (int i = 0; i < M; i++)
        {
            boolean[] found = new boolean[N];
            int cardcnt = 0, valcnt = 0;
        
            while (valcnt < N)
            {
                // Generate another value.
                int val = (int) (Math.random() * N);
                cardcnt++;
                if (!found[val])
                {
                    valcnt++;
                    found[val] = true;
                }
            }
            
            sumCount += cardcnt;
        }
        
        // How many cards we have to collect to find all, on average by M trials
        System.out.println("Experimental result: " + 1.0 *sumCount / M);
        System.out.println("Calculated result: " + 1.0 * N * hN);
    }
}