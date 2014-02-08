// Exercise 1.4.27

public class Rumors
{
    public static void main(String[] args)
    {
        // N - experiments, M - guests
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        int everyone = 0;
        int howMany = 0;
        
        for (int i = 0; i < N; i++)
        {
            boolean[] guests = new boolean[M];
            
            int bob = (int) (Math.random() * M);
            guests[bob] = true;
        
            boolean finish = false;
        
            while (!finish)
            {
                int newBob = 0;
                
                do
                    newBob = (int) (Math.random() * M);
                while (newBob == bob);
            
                if (guests[newBob] == true)
                {
                    finish = true;
                    break;
                }
                else
                {
                    guests[newBob] = true;
                    bob = newBob;
                    howMany++;                    
                }
            
                boolean allKnow = true;
            
                for (int j = 0; j < M; j++)
                {
                    if (guests[j] == false)
                    {
                        allKnow = false;
                        break;
                    }
                }
            
                if (allKnow)
                {
                    finish = true;
                    everyone++;
                }
            }
        }
        
        System.out.println("Probability of everybody at the party knowing " + 1.0 * everyone / N);
        System.out.println("How many guest know when the rumor dies " + 1.0 * howMany / N);
    }
}
        
        
            