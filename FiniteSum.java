public class FiniteSum
{
    public static void main(String[] args)
    {
        // Compute a finite sum (1 + 2 + ... + N)
        int N = Integer.parseInt(args[0]);
        
        int sum = 0;
        for(int i = 1; i<= N; i++)
            sum += i;
        
        System.out.println(sum);
    }
}