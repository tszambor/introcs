// Program 2.1.3
// Exercise 2.1.23

public class RareCouponAvg
{
    public static int uniform(int N)
    {
        // Generate a random integer between 0 and N-1.
        return (int) (Math.random() * N);
    }
    
    public static int uniform(int N, int M)
    {
        // Generate a random integer between 0 and N-1.
        // the value M (< N) is returned with probability of N/1000 though.
        int ret = 0;
        
        ret = uniform(N);
        
        if (ret == M)
        {
            if (Math.random() < .001)
                return ret;
            else
            {
                do
                    ret = uniform(N);
                while (ret == M);
            }
        }
        
        return ret;
    }
    
    public static int collect(int N, int M)
    {
        // Collect coupons until getting one of each value.
        boolean[] found = new boolean[N];
        int cardcnt = 0, valcnt = 0;
        while (valcnt < N)
        {
            int val = uniform(N, M);
            cardcnt++;
            if (!found[val]) valcnt++;
            found[val] = true;
        }
        return cardcnt;
    }
    
    public static void main(String[] args)
    {
        // Print the number of coupons collected.
        // to get N different coupons.
        int N = Integer.parseInt(args[0]);
        int K = Integer.parseInt(args[1]);
        int M = uniform(N);
        
        long sum = 0;
        
        for (int i = 0; i < K; i++)
            sum += collect(N, M);
        
        StdOut.println(sum / K);
    }
}