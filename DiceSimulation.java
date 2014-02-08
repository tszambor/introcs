// Exercise 1.4.20

public class DiceSimulation
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]); // N has to be around 10000000 to match the theoretical result to 3 decimal places
        
        double[] dist = new double[13];
        double[] experiment = new double[13];
        
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
            dist[i+j] += 1.0;
        
        for (int k = 1; k <= 12; k++)
            dist[k] /= 36.0;
        
        for (int i = 1; i <= 12; i++)
            System.out.println(dist[i]);
        
        for (int i = 0; i < N; i++)
        {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            
            experiment[dice1 + dice2] += 1.0;
        }
        
        for (int i = 1; i <= 12; i++)
            experiment[i] /= N;
        
        for (int i = 1; i <= 12; i++)
            System.out.println(experiment[i]);
        
    }
}