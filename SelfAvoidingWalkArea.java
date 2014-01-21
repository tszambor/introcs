// Exercise 1.4.19
// Program 1.4.4

public class SelfAvoidingWalkArea
{
    public static void main(String[] args)
    {
        // Do T random self-avoiding walks
        //   in an N-by-N lattice
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        int deadEnds = 0;
        int areaSumDeadEnd = 0, areaSumSuccess = 0;
        
        for (int t = 0; t < T; t++)
        {
            boolean[][] a = new boolean[N][N];
            int x = N/2, y = N/2;
            int minx = x, maxx = x;
            int miny = y, maxy = y;
            
            boolean currentDeadEnd = false;
            
            while (x > 0 && x < N-1 && y > 0 && y < N-1)
            {
                // Check for dead end and make a random move.
                a[x][y] = true;
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
                {
                    deadEnds++; areaSumDeadEnd += (maxx - minx) * (maxy - miny); currentDeadEnd = true; break;
                }
                
                double r = Math.random();
                
                if      (r < 0.25) { if (!a[x+1][y]) x++; if (x > maxx) maxx = x;}
                else if (r < 0.50) { if (!a[x-1][y]) x--; if (x < minx) minx = x;}
                else if (r < 0.75) { if (!a[x][y+1]) y++; if (y > maxy) maxy = y;}
                else if (r < 1.00) { if (!a[x][y-1]) y--; if (y < miny) miny = y;}
            }
            
            if (!currentDeadEnd)
            {
                areaSumSuccess += (maxx - minx) * (maxy - miny);
                currentDeadEnd = false;
            }
        }
        
        System.out.println(100*deadEnds/T + "% dead ends");
        System.out.println(deadEnds);
        if (deadEnds > 0)
            System.out.println("Average area of rectangles enclosing the dead end paths " + areaSumDeadEnd / deadEnds);
        if (deadEnds < T)
            System.out.println("Average area of rectangles enclosing the successful paths " + areaSumSuccess / (T - deadEnds));
    }
}