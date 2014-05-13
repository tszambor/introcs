// Program 2.1.3

public class CouponAvg
{
    public static int uniform(int N)
    {
        // Generate a random integer between 0 and N-1.
        return (int) (Math.random() * N);
    }
    
    public static int collect(int N)
    {
        // Collect coupons until getting one of each value.
        boolean[] found = new boolean[N];
        int cardcnt = 0, valcnt = 0;
        while (valcnt < N)
        {
            int val = uniform(N);
            cardcnt++;
            if (!found[val]) valcnt++;
            found[val] = true;
        }
        return cardcnt;
    }
    
    public static void main(String[] args)
    {
        // Print the number of coupons collected
        // to get N different coupons.
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        long sum = 0;
        
        for (int i = 0; i < M; i++)
            sum += collect(N);
        
        StdOut.println(sum / M);
    }
}