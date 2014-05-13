// Exercise 2.1.15

public class AccountChecksum
{
    public static int f(int d)
    {
        return (2*d) / 10 + (2*d) % 10;
    }
    
    public static void main(String[] args)
    {
        long arg = Long.parseLong(args[0]);
        
        int div = 1;
        
        int[] digits = new int[10];
        int[] checksum = new int[10];
        
        for (int i = 0; i < 10; i++)
        {
            int digit = (int) (arg / div) % 10;
            digits[9-i] = digit;
            
            if ((9 - i) % 2 != 0)
                checksum[9-i] = f(digits[9-i]);
            else
                checksum[9-i] = digits[9-i];
            
            div *= 10;
        }
        
        int sum = 0;
        
        for (int i = 0; i < 10; i++)
            sum += checksum[i];
        
        int lastDigit = 10 - sum % 10;
        
        StdOut.println(sum);
        for (int i = 0; i < 10; i++)
            StdOut.print(digits[i]);
        StdOut.print(lastDigit);
        StdOut.println();
    }
}