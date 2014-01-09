// Exercise 1.3.35

public class RandomWalker
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        int x = 0, y = 0; // initial position of the walker
        
        int sumMoves = 0;
        
        while (Math.abs(x) < N && Math.abs(y) < N)
        {
            double move = Math.random();
            
            if (move < 0.25)
            {
                x++;
            }
            else
                if (move < 0.5)
            {
                x--;
            }
            else if (move < 0.75)
            {
                y++;
            }
            else 
                y--;
            
            sumMoves++;
        }
        
        System.out.println(sumMoves);
    }
}
        