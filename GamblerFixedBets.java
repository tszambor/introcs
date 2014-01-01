// Exercise 1.3.24

public class GamblerFixedBets
{
    public static void main(String[] args)
    {
        // Run T experiments that start with $stake
        // and terminate on $0 or $goal
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        int maxBets = Integer.parseInt(args[3]);
                
        int bets = 0;
        int wins = 0;
        int cashTotal = 0;
        
        for (int t = 0; t < T; t++)
        {
            // Run one experiment.
            int cash = stake;
            int betsPerTrial = 0;
            while (cash > 0 && cash < goal && betsPerTrial < maxBets)
            {
                // Simulate one bet.
                bets++;
                betsPerTrial++;
                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            
            // Cash is either 0 (ruin) or $goal (win)
            if (cash >= goal)
                wins++;
            // Did we exit because we reached the total amount of bets possible?
            if (betsPerTrial == maxBets)
                cashTotal += cash;
        }
        
        System.out.println(100 * wins / T + "% wins");
        System.out.println("Avg # bets: " + 1.0 * bets / T);
        System.out.println("Avg $ when exiting game " + 1.0 * cashTotal / T);
    }
}
        