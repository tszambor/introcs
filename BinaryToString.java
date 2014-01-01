// Exercise 1.3.20
public class BinaryToString
{
    public static void main(String[] args)
    {
        // Print binary representation of N.
        int N = Integer.parseInt(args[0]);
        String s = "";
        int v = 1;
        
        while (v <= N/2)
            v = 2*v;
        
        // Now v is the largest power of 2 <= N.
        
        int n = N;
        
        while (v > 0)
        {
            // Cast out powers of 2 in decreasing order.
            if (n < v)
            {
                s += 0;
            }
            else
            {
                s += 1;
                n -= v;
            }
            
            v = v/2;
        }
        
        System.out.println(s);
        
        String s2 = "";
        
        for (int m = N; m > 0; m /= 2)
            s2 = (m % 2) + s2;
        
        System.out.println(s2);
    }
}