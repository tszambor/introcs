// Exercise 1.5.37
import java.awt.*;

public class TilePattern3
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int checkerboard = Integer.parseInt(args[1]);
        int color = Integer.parseInt(args[2]);
        
        Color col = StdDraw.BLACK;
        
        if (color == 1)
            col = StdDraw.BLUE;
        else if (color == 2)
            col = StdDraw.RED;
        else if (color == 3)
            col = StdDraw.GREEN;
            
        
        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        
        StdDraw.clear(col);
        
        for (int y = 0; y < N; y++)
        {
            for (int x = 0; x < N; x++)
            {
                // Design 1
                double x0 = 1.0 * x / N;
                double y0 = 1.0 * y / N;
                
                if (checkerboard > 0 && (x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0) )
                {
                    StdDraw.setPenColor(col);
                    StdDraw.filledSquare(x0 + 1.0 / 2.0*N, y0 + 1.0 / 2.0*N, 1.0 / 2.0 * N);
                }
                else
                {
                    double[] bigDiamondX = { x0 + 0.0 / N, x0 + 0.5 / N, x0 + 1.0 / N, x0 + 0.5 / N };
                    double[] bigDiamondY = { y0 + 0.5 / N, y0 + 1.0 / N, y0 + 0.5 / N, y0 + 0.0 / N };
                
                    StdDraw.setPenColor(StdDraw.GRAY);
                    StdDraw.filledPolygon(bigDiamondX, bigDiamondY);
                
                    StdDraw.setPenColor(StdDraw.WHITE);
        
                    StdDraw.filledSquare(x0 + .125 / N, y0 + .125 / N, .125 / N);
                    StdDraw.filledSquare(x0 + (1.0 - .125) / N, y0 + .125 / N, .125 / N);
                    StdDraw.filledSquare(x0 + .125 / N, y0 + (1.0 - .125) / N, .125 / N);
                    StdDraw.filledSquare(x0 + (1.0 - .125) / N, y0 + (1.0 - .125) / N, .125 / N);
                }
            }
        }
    }
}
        
            