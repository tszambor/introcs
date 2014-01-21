// Exercise 1.4.18
// A modification of program 1.4.4

public class SelfAvoidingWalkAL
{
    public static void main(String[] args)
    {
        // Do T random self-avoiding walks
        //   in an N-by-N lattice
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        int deadEnds = 0;
        
        int successPathSum = 0, deadEndPathSum = 0;
        
        for (int t = 0; t < T; t++)
        {
            boolean[][] a = new boolean[N][N];
            int x = N/2, y = N/2;
            
            int currentPath = 0;
            boolean deadEnd = false;
            
            while (x > 0 && x < N-1 && y > 0 && y < N-1)
            {
                // Check for dead end and make a random move.
                a[x][y] = true;
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
                {
                    deadEnds++; deadEnd = true; break;
                }
                
                double r = Math.random();
                
                if      (r < 0.25) { if (!a[x+1][y]) x++; }
                else if (r < 0.50) { if (!a[x-1][y]) x--; }
                else if (r < 0.75) { if (!a[x][y+1]) y++; }
                else if (r < 1.00) { if (!a[x][y-1]) y--; }
                
                currentPath++;
            }
            
            if (deadEnd)
            {
                deadEndPathSum += currentPath;
                deadEnd = false;
            }
            else
                successPathSum += currentPath;
        }
        
        System.out.println(100*deadEnds/T + "% dead ends");
        
        System.out.println("Average length of success path " + successPathSum / (T - deadEnds));
        
        System.out.println("Average length of dead end path " + deadEndPathSum / deadEnds);
    }
}