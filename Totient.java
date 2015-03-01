// Exercise 2.1.26
// Implementation of Euler's Totient function fi(n).

public class Totient {
    
    public static int fi(int n)
    {
        int sum = 0;
        
        for (int i = 1; i <= n; i++)
        {
            if (gcd(i, n) == 1)
                sum++;
        }
        
        return sum;
    }
    
    public static int gcd(int i, int j)
    {
        while (i % j != 0)
        {
             if (i < j)
             {
                 int temp = i;
                 i = j;
                 j = temp;
             }        
             i = i % j;
        }
        
        return j;
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        
        StdOut.println(fi(n));
    }
}
        