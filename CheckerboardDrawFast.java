// Exercise 1.5.18

public class CheckerboardDrawFast
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        
        StdDraw.filledSquare(N / 2.0, N / 2.0, N / 2.0);
        
        StdDraw.setPenColor(StdDraw.RED);
        
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (i % 2 == 0)
                {
                    if (j % 2 == 0)
                        StdDraw.filledSquare(j + 0.5, i + 0.5, 0.5);
                }
                else
                {
                    if (j % 2 != 0)
                        StdDraw.filledSquare(j + 0.5, i + 0.5, 0.5);
                }                    
            }
        }
    }
}