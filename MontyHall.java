// Exercise 1.3.40

public class MontyHall
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int wins = 0, winsvar = 0;
        
        for (int i = 0; i < N; i++)
        {
            // place the prize
            int prize = (int)(Math.random()*3) + 1;
            
            // pick a winner
            int pick = (int)(Math.random()*3) + 1;
            
            if (pick == prize)
                wins++;
            
            // select which door to reveal
            if (pick != prize)
                winsvar++;
        }
        
        System.out.println("Static strategy: " + (double)wins / N);
        System.out.println("Variable strategy: " + (double)winsvar / N);
    }
}