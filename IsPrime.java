public class IsPrime
{
    public static void main(String[] args)
    {
        long number = Long.parseLong(args[0]);
        
        boolean isPrime = true;
        
        for (long i = 2; i <= number / i; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        
        // What could be tested here is: if (i > number / i) then the number is prime (it did meet the condition in the loop).
        // i has to be defined before the for loop. The book page 70.
        
        System.out.println(isPrime);
    }
}