// Exercise 1.3.9

public class UniformRndN
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        double sum = 0.0;
        
        for (int i = 0; i < N; i++)
        {
            double rnd = Math.random();
            System.out.println(rnd);
            sum += rnd;
        }
        
        double avr = sum / N;
        
        System.out.println("Average: " + avr);
    }
}