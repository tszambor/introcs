// Exercise 1.3.14

public class PowersOfTwoN
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int i = 1;
            
        if (N >= 0) do
        {
            System.out.println(i);
            
            i = 2 * i;
        } while(i <= N);
    }
}