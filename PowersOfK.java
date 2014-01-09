// Exercise 1.3.30

public class PowersOfK
{
    public static void main(String[] args)
    {
        int k = Integer.parseInt(args[0]);
        
        int power = 0;
        if (Math.abs(k) != 1 && k != 0)
        {
            while (Math.pow(k, power) < Long.MAX_VALUE)
            {
                long result = (long)Math.pow(k, power);
                
                if (result > 0)
                    System.out.println (result);
            
                power++;
            }
        }
        else
            System.out.println(k);
    }
}