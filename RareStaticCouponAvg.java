// Exercise 2.1.23
// September 2014 edition

public class RareStaticCouponAvg {
    
    public static int uniform(int N)
    {
        return (int) (Math.random() * N);
    }
    
    public static int getCoupon(int N, int rareValue)
    {
        int RARITY = 1000;

        int value;
        
        do
        {
            value = uniform(N * RARITY);
            
        } while (value / RARITY == rareValue && value != rareValue);
        
        if (value == rareValue)
            return value;
        else
            return value / RARITY;
    }
    
    public static int collect(int N)
    {
        boolean[] found = new boolean[N];
        
        int cardcnt = 0, valcnt = 0;
        int rareValue = uniform(N);
        
        while (valcnt < N)
        {
            int val = getCoupon(N, rareValue);
            cardcnt++;
            if (!found[val])
            {
                valcnt++;
            }
            found[val] = true;
        }
        
        return cardcnt;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        int sum = 0;
        
        for (int i = 0; i < M; i++)
            sum += collect(N);
        
        StdOut.println(sum/M);
    }
}