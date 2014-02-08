// Exercise 1.4.18
// A modification of program 1.4.4

public class SelfAvoidingWalkAL3D
{
    public static void main(String[] args)
    {
        // Do T random self-avoiding walks
        //   in an N-by-N-byN lattice
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        int deadEnds = 0;
        
        int successPathSum = 0, deadEndPathSum = 0;
        
        for (int t = 0; t < T; t++)
        {
            boolean[][][] a = new boolean[N][N][N];
            int x = N/2, y = N/2, z = N/2;
            
            int currentPath = 0;
            boolean deadEnd = false;
            
            while (x > 0 && x < N-1 && y > 0 && y < N-1 && z > 0 && z < N-1)
            {
                // Check for dead end and make a random move.
                a[x][y][z] = true;
                
                if (a[x-1][y][z] && a[x+1][y][z] && a[x][y-1][z] && a[x][y+1][z] && a[x][y][z-1] && a[x][y][z+1])
                {
                    deadEnds++; deadEnd = true; System.out.println("Dead End!"); break;
                }
                
                double r = Math.random();
                
                if      (r < 0.166667) { if (!a[x+1][y][z]) { x++; currentPath++;} }
                else if (r < 0.333333) { if (!a[x-1][y][z]) { x--; currentPath++;} }
                else if (r < 0.5) { if (!a[x][y+1][z]) { y++; currentPath++;} }
                else if (r < 0.666667) { if (!a[x][y-1][z]) { y--; currentPath++;} }
                else if (r < 0.833333) { if (!a[x][y][z-1]) { z--; currentPath++;} }
                else { if (!a[x][y][z+1]) { z++; currentPath++;} }
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
        
        if (deadEnds < T)
            System.out.println("Average length of success path " + successPathSum / (T - deadEnds));
        
        if (deadEnds > 0)
            System.out.println("Average length of dead end path " + deadEndPathSum / deadEnds);
    }
}