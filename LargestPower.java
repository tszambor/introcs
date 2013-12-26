public class LargestPower
{
    public static void main(String[] args)
    {
        // Print largest power of 2 less than or equal to N
        
        int N = Integer.parseInt(args[0]);
        
        int v = 1;
        while (v <= N/2)
            v = v * 2;
        
        System.out.println(v);
    }
}