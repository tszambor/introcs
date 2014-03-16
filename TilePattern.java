// Exercise 1.5.37

public class TilePattern
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        StdDraw.setXscale(1.0/22.0, 21.0/22.0);
        StdDraw.setYscale(1.0/22.0, 21.0/22.0);
        
        StdDraw.clear(StdDraw.BLACK);
        
        for (int y = 0; y < N; y++)
        {
            for (int x = 0; x < N; x++)
            {
                // Design 1
                double x0 = 1.0 * x / N;
                double y0 = 1.0 * y / N;
                
                double[] bigDiamondX = { x0 + 0.0 / N, x0 + 0.5 / N, x0 + 1.0 / N, x0 + 0.5 / N };
                double[] bigDiamondY = { y0 + 0.5 / N, y0 + 1.0 / N, y0 + 0.5 / N, y0 + 0.0 / N };
                
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.filledPolygon(bigDiamondX, bigDiamondY);
                
                StdDraw.setPenColor(StdDraw.WHITE);
                
                double[] smallTriangleXLow = { x0 + 0.0 / N, x0 + 0.25 / N, x0 + 0.25 / N };
                double[] smallTriangleYLow = { y0 + 0.25 / N, y0 + 0.25 / N, y0 + 0.0 / N };
                
                double[] smallTriangleXHigh = new double[smallTriangleXLow.length];
                double[] smallTriangleYHigh = new double[smallTriangleYLow.length];
                
                for (int i = 0; i < smallTriangleXLow.length; i++)
                {
                    smallTriangleXHigh[i] = 2 * x0 + 1.0 / N - smallTriangleXLow[i];
                    smallTriangleYHigh[i] = 2 * y0 + 1.0 / N - smallTriangleYLow[i];
                }
                
                StdDraw.filledPolygon(smallTriangleXLow, smallTriangleYLow);
                StdDraw.filledPolygon(smallTriangleXLow, smallTriangleYHigh);
                StdDraw.filledPolygon(smallTriangleXHigh, smallTriangleYLow);
                StdDraw.filledPolygon(smallTriangleXHigh, smallTriangleYHigh);
            }
        }
    }
}
        
            