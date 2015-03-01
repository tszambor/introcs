// Program 1.3.5
// Harmonic numbers

public class Harmonic
{
    public static void main(String[] args)
    {
        // Compute the Nth Harmonic number.
        int N = Integer.parseInt(args[0]);
        
        double sum = 0.0;
        
        for (int i = 1; i<= N; i++)
        {
            // Add the ith term to the sum
            sum += 1.0/i;
        }
        
        System.out.println(sum);
    }
}