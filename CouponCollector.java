public class CouponCollector
{
    public static void main(String[] args)
    {
        // Generate random values in (0..N] until finding each one.
        int N = Integer.parseInt(args[0]);
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
        // N different values found.
        System.out.println(cardcnt);
    }
}