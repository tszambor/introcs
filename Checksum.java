// Exercise 1.3.33

public class Checksum
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int isbn = N;
        
        int sum = 0;
        
        // go through all the digits and sum them
        for (int i = 8; i >= 0; i--)
        {
            int digit = N / (int)Math.pow(10, i);
            sum += (i+2)*digit;
            N = N - (int)Math.pow(10, i) * digit;
        }
        
        System.out.println(sum);
        
        // now let's check how much has to be added for it to be divisible through 11
        int difference = (11 - (sum % 11)) % 11;
        
        // print the ISBN number
        System.out.print(isbn + "-");
        
        if (difference < 10)
            System.out.println(difference);
        else
            System.out.println("X");
        
    }
}