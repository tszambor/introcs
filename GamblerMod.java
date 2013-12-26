public class GamblerMod
{
    public static void main(String[] args)
    {
        // Run T experiments that start with $stake
        // and terminate on $0 or $goal
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        
        int wins = 0;
        
        int betsSuccess = 0;
        int betsFail = 0;
        
        for (int t = 0; t < T; t++)
        {
            // Run one experiment.
            int cash = stake;
            int bets = 0;
            while (cash > 0 && cash < goal)
            {
                // Simulate one bet.
                bets++;
                if (Math.random() < 0.5)
                    cash += 50;
                else
                    cash -= 50;
            }
            
            // Cash is either 0 (ruin) or $goal (win)
            if (cash >= goal)
            {
                wins++;
                betsSuccess += bets;
            }
            else
                betsFail += bets;
        }
        
        System.out.println(100 * wins / T + "% wins");
        System.out.println("Avg # bets success: " + betsSuccess / wins);
        System.out.println("Avg # bets failure: " + betsFail / (T - wins));
    }
}
        