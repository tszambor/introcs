// Exercise 1.3.39

public class Pepys
{
    public static void main(String[] args)
    {
        // check assumption one
        
        int N = Integer.parseInt(args[0]); // how many experiments should be performed?
        
        int exp1 = 0;
        
        for (int exp = 0; exp < N; exp++)
        {
            boolean success = false;
            
            for (int roll = 0; roll < 6; roll++)
            {
                if ((int)(Math.random() * 6) + 1 == 1)
                    success = true;
            }
            
            if (success)
                exp1++;
        }
        
        int exp2 = 0;
        
        for (int exp = 0; exp < N; exp++)
        {
            int sum = 0;
            
            for (int roll = 0; roll < 12; roll++)
            {
                if ((int)(Math.random() * 6) + 1 == 1)
                    sum++;
            }
            
            if (sum >= 2)
                exp2++;
        }
        
        System.out.println("Probability of rolling 1 once or more in 6 rolls: " + (double)exp1 / N);
        System.out.println("Probability of rolling 1 twice or more in 12 rolls: " + (double)exp2 / N);
    }
}