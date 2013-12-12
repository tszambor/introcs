// Exercise 1.2.20 - My mod

public class DiceDistributed
{
    public static void main(String[] args)
    {
        int[] distribution = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (int i=0; i<100000; i++)
        {
            int a = (int) (6 * Math.random()) + 1;
            int b = (int) (6 * Math.random()) + 1;
            
            distribution[a + b - 1]++;
        }
        
        for (int i = 0; i<12; i++)
        {
            System.out.println((i + 1) + ": " + distribution[i]);
        }
    }
}